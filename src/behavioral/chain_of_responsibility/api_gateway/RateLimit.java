package behavioral.chain_of_responsibility.api_gateway;

import java.util.HashMap;
import java.util.Map;

public class RateLimit extends Handler{
    private static final int MAX_REQUESTS = 5;
    private final Map<String, Integer> requestTracker = new HashMap<>();


    // windowStartTime: Stores the exact timestamp (in milliseconds)
    // when the current 1-minute tracking window began.
    // It initializes to the moment the { application starts up }.
    private long windowStartTime = System.currentTimeMillis();

    @Override
    protected void handle(Request req) {
        // currentTime: Captures the exact millisecond timestamp of the current incoming request.
        long currentTime = System.currentTimeMillis();
        String clientIp = req.getIp();
        // Simple Time Reset: If 1 minute (60,000 ms) has passed, wipe the ledger
        if (currentTime - windowStartTime >= 60000) {
            requestTracker.clear();
            windowStartTime = currentTime; // Reset the window timer
            System.out.println("[RateLimit] Time window expired. Tracker cleared.");
        }

        // Get the current request count for this IP, defaulting to 0 if it's new
        int currentCount = requestTracker.getOrDefault(clientIp, 0);

        // Check if they hit the ceiling
        if (currentCount >= MAX_REQUESTS) {
            System.out.println("Rate limit exceeded for IP: " + clientIp);
            return; // Stop the chain here
        }

        // Increment the count and save it back to the map
        requestTracker.put(clientIp, currentCount + 1);
        System.out.println("Rate limit OK for IP: " + clientIp + " (" + (currentCount + 1) + "/" + MAX_REQUESTS + ")");

        if(next!=null){
            next.handle(req);
        }
    }
}

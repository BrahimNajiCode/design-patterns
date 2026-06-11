package behavioral.chain_of_responsibility.api_gateway;

public class App {
    public static void main(String[] args) {
        Handler log = new Logging();
        Handler authentication = new Authentication();
        Handler authorization = new Authorization();
        Handler rateLimit = new RateLimit();
        Handler controller = new Controller();


        // Let's create our chain, it is alike to linked lists in C.
        log.setNext(authentication);
        authentication.setNext(rateLimit);
        rateLimit.setNext(authorization);
        authorization.setNext(controller);
        controller.setNext(null);

        // Requests
        Request request1 = new Request(
                "/api/admin/users",
                "token123",
                "ADMIN",
                "192.168.1.10"
        );

        Request request2 = new Request(
                "/api/admin/users",
                null,
                "ADMIN",
                "192.168.1.10"
        );

        Request request3  = new Request(
                "/api/admin/users",
                "token123",
                "USER",
                "192.168.1.10"
        );

        // Handlers
        System.out.println("============================================");
        System.out.println("======== WELCOME TO CoR API GATEWAY ========");
        System.out.println("============================================");
        log.handle(request1);
        System.out.println("============================================");
        log.handle(request2);
        System.out.println("============================================");
        log.handle(request3);
        System.out.println("============================================");

    }
}

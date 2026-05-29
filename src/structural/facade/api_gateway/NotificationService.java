package structural.facade.api_gateway;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NotificationService {
    // The idea is to create a stream to read notifications from Notifications.txt
    FileReader fileReader;
    public NotificationService() throws IOException {
        fileReader = new FileReader(new File("src/structural/facade/api_gateway/Notifications.txt"));
    }

    public void fetchUserNotifications() throws IOException {
        int c;
        while ((c=fileReader.read())!=-1){
            System.out.print((char)c);
        }
    }

}

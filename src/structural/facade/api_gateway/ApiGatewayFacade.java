package structural.facade.api_gateway;

import java.io.IOException;

public class ApiGatewayFacade {
    UserService userService;
    AuthService authService;
    NotificationService notificationService;
    public ApiGatewayFacade() throws IOException {
        userService = new UserService();
        authService = new AuthService();
        notificationService =  new NotificationService();
    }
    public void getDashboardData() throws IOException {
        if(authService.validate("GET /users/1?token=123$456#")){
           User user = userService.fetchData();
           notificationService.fetchUserNotifications();
        }
    }
}

package structural.decorator.logging;

public class LoggingDecorator implements UserService{
    // wrap the component into the decorator.
    protected UserService userService;

    public LoggingDecorator(UserService userService){
        this.userService = userService;
    }

    @Override
    public void createUser(String username) {
        System.out.println("[LOG] Before create.");
        userService.createUser(username);
        System.out.println("[LOG] After create.");
    }
}

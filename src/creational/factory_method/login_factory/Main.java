package creational.factory_method.login_factory;

public class Main {
    public static void main(String[] args) {
        LoginService service;
        service = LoginFactory.create("google");
        service.authenticate();
        service = LoginFactory.create("github");
        service.authenticate();
    }
}

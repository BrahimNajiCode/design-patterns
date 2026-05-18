package creational.factory_method.authentication_provider;

public class Main {
    public static void main(String[] args) {
        AuthProvider auth;
        auth = AuthFactory.create("google");
        auth.login();
        auth = AuthFactory.create("");
        auth.login();
    }
}

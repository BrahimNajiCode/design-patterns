package creational.factory_method.authentication_provider;

public class FacebookAuth implements AuthProvider{
    @Override
    public void login() {
        System.out.println("Authentication by Facebook.");
    }
}

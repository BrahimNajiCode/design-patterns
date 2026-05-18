package creational.factory_method.authentication_provider;

public class GoogleAuth implements AuthProvider{
    @Override
    public void login() {
        System.out.println("Authentication by Google.");
    }
}

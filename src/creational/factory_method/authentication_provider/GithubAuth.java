package creational.factory_method.authentication_provider;

public class GithubAuth implements AuthProvider{
    @Override
    public void login() {
        System.out.println("Authentication by Github.");
    }
}

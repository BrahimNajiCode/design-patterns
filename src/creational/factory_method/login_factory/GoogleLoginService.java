package creational.factory_method.login_factory;

public class GoogleLoginService implements LoginService {

    @Override
    public void authenticate() {
        System.out.println("Google authentication.");
    }
}

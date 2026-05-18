package creational.factory_method.login_factory;

public class GithubLoginService implements LoginService {
    @Override
    public void authenticate(){
        System.out.println("Github authentication.");
    }
}

package creational.factory_method.login_factory;

public class LoginFactory {
    static LoginService create (String type){
        if(type.equalsIgnoreCase("google"))
            return new GoogleLoginService();
        if(type.equalsIgnoreCase("github"))
            return new GithubLoginService();
        if(type.equalsIgnoreCase("ldap"))
            return new LDAPLoginService();
        throw new IllegalArgumentException("UNKNOWN LOGIN TYPE");
    }
}

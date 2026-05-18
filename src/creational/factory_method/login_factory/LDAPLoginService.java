package creational.factory_method.login_factory;

public class LDAPLoginService implements LoginService {
    @Override
    public void authenticate(){
        System.out.println("LDAP authentication.");
    }
}

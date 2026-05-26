package structural.decorator.logging;

public class BasicUserService implements UserService{
    @Override
    public void createUser(String username){
        System.out.println("User created: "+username);
    }
}

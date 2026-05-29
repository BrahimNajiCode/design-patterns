package structural.facade.api_gateway;

public class UserService {


    public User fetchData(){
        return new User(1, "Brahim Naji", "USER", "English");
    }
}

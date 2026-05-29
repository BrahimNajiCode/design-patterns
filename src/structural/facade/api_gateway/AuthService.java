package structural.facade.api_gateway;

public class AuthService {

    public boolean validate(String url){
        if(url.contains("token=123$456#")){
            return true;
        }else{
            System.out.println("401 Unauthorized");
            return false;
        }
    }
}

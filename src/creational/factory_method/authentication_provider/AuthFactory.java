package creational.factory_method.authentication_provider;

public class AuthFactory {
    static AuthProvider create(String provider){
        if(provider.equalsIgnoreCase("google"))
            return new GoogleAuth();
        if(provider.equalsIgnoreCase("github"))
            return new GithubAuth();
        if(provider.equalsIgnoreCase("facebook"))
            return new FacebookAuth();
        throw  new IllegalArgumentException("[ERROR] UNKNOWN PROVIDER WAS PROVIDED.");
    }
}

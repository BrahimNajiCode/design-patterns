package behavioral.template_method.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class AuthenticationProcess {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationProcess.class);

    public void login(){
        receiveCredentials();
        authenticate();
        createSession();
        Log();
    }

    private void receiveCredentials(){
        System.out.println("Receiving credentials...");
    }
    private void createSession(){
        System.out.println("Creating a session...");
    }
    private void Log(){
        log.info("Login succeed.");
    }
    abstract protected void authenticate();
}

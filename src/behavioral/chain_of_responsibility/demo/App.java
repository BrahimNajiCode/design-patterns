package behavioral.chain_of_responsibility.demo;

public class App {
    public static void main(String[] args) {
        Handler h1 = new LowLevelSupport();
        Handler h2 = new ManagerSupport();
        Handler h3 = new DirectorSupport();
        h1.setNext(h2);
        h2.setNext(h3);
        h1.handle("password_reset");
        h1.handle("refund");
        h1.handle("Critical issue");
    }
}

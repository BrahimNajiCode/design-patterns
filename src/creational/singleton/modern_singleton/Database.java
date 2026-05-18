package creational.singleton.modern_singleton;

public enum Database {
    INSTANCE;
    public void connect(){
        System.out.println("Connected");
    }

    public static void main(String[] args) {
        Database.INSTANCE.connect();
    }
}

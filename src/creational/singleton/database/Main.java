package creational.singleton.database;

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        System.out.println(db1==db2); // prints `true` in CLI.
    }
}

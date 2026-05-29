package structural.proxy.database;

public class App {
    public static void main(String[] args) {
        DBService dbService1 = new DBProxy("Admin");
        DBService dbService2 = new DBProxy("uSer");
        dbService1.readData();
        dbService2.readData();
    }
}

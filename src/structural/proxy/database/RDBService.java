package structural.proxy.database;

public class RDBService implements DBService{
    @Override
    public void readData() {
        System.out.println("Reading Data from Database...");
    }

    @Override
    public void deleteData() {
        System.out.println("Deleting Data from Database...");
    }

    @Override
    public void updateData() {
        System.out.println("Updating Data from Database...");
    }
}

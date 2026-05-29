package structural.proxy.database;

public class DBProxy implements DBService{
    private String role;
    private RDBService rdbService;

    public DBProxy(String role){
        this.role = role;
    }

    @Override
    public void readData() {
        if(!isAuthorized(role)){
            System.out.println("Access denied! Only admins can read from database.");
            return;
        }

        // LAZY INITIALIZATION
        if(rdbService == null)
            rdbService = new RDBService();
        rdbService.readData();

    }

    @Override
    public void deleteData() {
        if(!isAuthorized(role)){
            System.out.println("Access denied! Only admins can delete from database.");
            return;
        }

        // LAZY INITIALIZATION
        if(rdbService == null)
            rdbService = new RDBService();
        rdbService.deleteData();
    }

    @Override
    public void updateData() {
        if(!isAuthorized(role)){
            System.out.println("Access denied! Only admins can update  database.");
            return;
        }

        // LAZY INITIALIZATION
        if(rdbService == null)
            rdbService = new RDBService();
        rdbService.updateData();
    }

    public boolean isAuthorized(String role){
        return role.equalsIgnoreCase("admin");
    }
}

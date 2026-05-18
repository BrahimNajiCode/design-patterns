package creational.singleton.database;

public class Database {
    // 1. Create Static Instance
    private static Database instance;

    // 2. Private constructor, WHY?
    // If constructor was public: Anyone could create new objects.
    // Database db1 = new Database(); Database db2 = new Database();
    private Database(){}

    // 3. public access method to return same instance
    public static synchronized Database getInstance() {
        //NOTE : TO KNOW WHY WE ADDED synchronized, please consult [[problem.md]] file.
        // by checking if it's null ==> means instance does not used yet, so we need to
        // allocate it.
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }
    // Now every class calls this, it returns same pointer to same database.
}

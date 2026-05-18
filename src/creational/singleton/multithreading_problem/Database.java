package creational.singleton.multithreading_problem;


public class Database {
    private static Database instance;

    private Database() {System.out.println("Database created");}

    public static  Database getInstance() {
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }

    public static void main(String[] args) {
        Runnable task = ()->{
            Database db =Database.getInstance();
            System.out.println(
                    Thread.currentThread().getName()+
                            "->" + db.hashCode()
            );
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        // Problem:
        //Two different objects were created.
        //Singleton is broken.
        // Let's say we have this sequence
        // 1. Thread 1 verify `if(instance == null)`.
        // 2. CPU switches to another thread.
        // 3. Thread 2 also verify, `if(instance == null)`.
        // 4. both conditions are true, So BOTH threads create objects.
    }
}


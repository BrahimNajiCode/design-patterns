package creational.singleton.multithreading_problem;

public class DatabaseSolved {


        private static DatabaseSolved instance;

        private DatabaseSolved() {System.out.println("Database created");}
        // synchronized is THE SOLUTION.
        public static synchronized DatabaseSolved getInstance() {
            if(instance == null){
                instance = new DatabaseSolved();
            }
            return instance;
        }

        public static void main(String[] args) {
            Runnable task = ()->{
                DatabaseSolved db = DatabaseSolved.getInstance();
                System.out.println(
                        Thread.currentThread().getName()+
                                "->" + db.hashCode()
                );
            };
            Thread t1 = new Thread(task);
            Thread t2 = new Thread(task);
            t1.start();
            t2.start();
            //Database created
            //Thread-0->955920423
            //Thread-1->955920423
        }
}

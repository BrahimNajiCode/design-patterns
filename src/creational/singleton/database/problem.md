## Lazy vs Eager Singleton
### Lazy Initialization

     if(instance == null)
> Object created only when needed.

   

Pros:
- [x] saves memory

Cons:

- [ ] thread safety problems possible

#### Eager Initialization
    private static final Database instance = new Database();

> Object created immediately.

Example:

    public class Database {
    
        private static final Database instance = new Database();
    
        private Database() {}
    
        public static Database getInstance() {
            return instance;
        }
    }

Pros:

- [x] simple
- [x] thread-safe

Cons:

- [ ] object created even if never used
Thread Safety Problem

`In multithreading`:

Two threads may execute:

    if(instance == null)

at same time.

Result:

> two objects created Singleton ``broken``Thread-Safe Singleton

    public class Database {
    
        private static Database instance;
    
        private Database() {}
    
        public static synchronized Database getInstance() {
    
            if(instance == null) {
                instance = new Database();
            }
    
            return instance;
        }
    }

`synchronized` prevents race conditions.
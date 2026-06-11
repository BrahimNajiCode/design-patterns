package behavioral.iterator.demo;

public class BookCollection implements Collection{
    private String[] books = {
            "Atomic Habits",
            "System design interview",
            "The prince"
    };


    @Override
    public Iterator createIterator() {
        return new BookIterator(books) ;
    }
}

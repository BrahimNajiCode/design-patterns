package behavioral.iterator.demo;

public class App {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        Iterator bookIterator = bookCollection.createIterator();
        while(bookIterator.hasNext()){
            System.out.println(bookIterator.next());
        }
    }
}

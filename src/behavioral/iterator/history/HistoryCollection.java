package behavioral.iterator.history;

public class HistoryCollection implements Collection<URL>{
    private URL[] history;
    private int size = 0;

    public HistoryCollection(int capacity){
        history = new URL[capacity];
    }

    public void AddValue(URL value){
        if(size < history.length){
            history[size++] = value;
        }
    }


    @Override
    public Iterator<URL> createIterator() {
        return new HistoryIterator(history);
    }
}

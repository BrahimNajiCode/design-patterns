package behavioral.iterator.history;

public class HistoryIterator implements Iterator<URL>{
    private URL[] history;
    private int currentIndex = 0;

    public HistoryIterator(URL[] history) {
        this.history = history ;
    }


    @Override
    public boolean hasNext() {
        return currentIndex < history.length ;
    }

    @Override
    public URL next() {
        return history[currentIndex++];
    }
}

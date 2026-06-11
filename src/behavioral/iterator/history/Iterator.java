package behavioral.iterator.history;

// Make it generic, to make work easy.
public interface Iterator<T> {
    boolean hasNext();
    T next();
}

package behavioral.iterator.demo;

public class BookIterator implements Iterator{
    private String[] books;
    private int position =0;

    public BookIterator(String[] books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position< books.length;
    }

    @Override
    public String next() {
        return books[position++];
    }
}

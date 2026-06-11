package behavioral.iterator.history;

public class App {
    public static void main(String[] args) {
        // S-001
        URL url1 = new URL("com", "google" ,"mail");
        URL url2 = new URL("ma", "ensaf" ,"dws");
        URL url3 = new URL("ai", "claude" ,"apis");

        HistoryCollection collection = new HistoryCollection(3);
        collection.AddValue(url1);
        collection.AddValue(url2);
        collection.AddValue(url3);

        Iterator<URL> iterator = collection.createIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().getURL());
        }

    }
}

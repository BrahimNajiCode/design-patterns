package structural.adapter.formatter;

public class App {
    public static void main(String[] args) {
        XmlToJsonAdapter xmlToJsonAdapter = new XmlToJsonAdapter(new XMLConverter());
        System.out.println(xmlToJsonAdapter.toJson());
    }
}

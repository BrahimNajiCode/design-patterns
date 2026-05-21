package creational.prototype.document;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Document pfeDoc = new Document("Optimization of RNN networks.");
        pfeDoc.setContent("I bluffed, I got no optimization here.");
        Document clone1 = pfeDoc.clone();
        clone1.setTitle("Optimization of RNN networks-copy1");
        Document clone2 = pfeDoc.clone();
        clone2.setTitle("Optimization of RNN networks-copy2");
        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone1 == pfeDoc);
        System.out.println(clone2 == clone1);
    }
}

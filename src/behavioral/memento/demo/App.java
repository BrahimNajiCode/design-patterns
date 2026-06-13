package behavioral.memento.demo;

public class App {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello World!");
        history.push(editor.save());

        editor.write("Diffrent Text");
        System.out.println(editor.getContent());
        System.out.println("===================================");
        System.out.println(history.pop().getContent());
    }
}

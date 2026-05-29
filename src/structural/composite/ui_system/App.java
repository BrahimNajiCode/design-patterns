package structural.composite.ui_system;

public class App {
    public static void main(String[] args) {
        Button btn = new Button();
        TextField txt = new TextField();
        Panel p = new Panel("myPanel");
        p.add(btn);
        p.add(txt);
        p.render();
    }
}

package creational.abstract_factory.os_demo;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;
        String os = "Mac";
        if(os.equals("Windows")){
            factory = new WindowsFactory();
        }else{
            factory = new MacFactory();
        }

        Button button = factory.createButton();
        Text text = factory.createText();

        button.render();
        text.render();
    }
}

package creational.abstract_factory.os_demo;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Text createText() {
        return new MacText();
    }
}

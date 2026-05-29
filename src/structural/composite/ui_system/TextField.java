package structural.composite.ui_system;

public class TextField implements UIComponent{
    @Override
    public void render() {
        System.out.println("\tRendering TextField...");
    }

    @Override
    public void add(UIComponent uiComponent) {
        System.out.println("\tTextField Added.");
    }

    @Override
    public void remove(UIComponent uiComponent) {
        System.out.println("\tTextField removed.");
    }
}

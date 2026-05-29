package structural.composite.ui_system;

public class Button implements UIComponent{
    // You can get inspired by swing and add multiple constructors (empty, text, icon, etc)
    // But no need for this case.

    @Override
    public void render() {
        System.out.println("\tRendering button...");
    }

    @Override
    public void add(UIComponent uiComponent) {
        System.out.println("\tButton Added.");
    }

    @Override
    public void remove(UIComponent uiComponent) {
        System.out.println("\tButton removed.");
    }
}

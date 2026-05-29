package structural.composite.ui_system;

public interface UIComponent {
    void render();
    void add (UIComponent uiComponent);
    void remove (UIComponent uiComponent);
}

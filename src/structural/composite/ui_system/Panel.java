package structural.composite.ui_system;

import java.util.ArrayList;
import java.util.List;

public class Panel implements UIComponent{
    // As we know panel is a container, that contains and organizes multiple components.
    private String namePanel;
    private List<UIComponent> uiComponentList;

    // First Constructor
    public Panel(String namePanel){
        this.namePanel = namePanel;
        uiComponentList = new ArrayList<>();
    }
    // Second Constructor
    public Panel(){
        uiComponentList = new ArrayList<>();
    }

    @Override
    public void render() {
        String message = namePanel == null ? "Panel: " : namePanel+": ";
        System.out.println(message);
        for(UIComponent uiComponent: uiComponentList){
            uiComponent.render();
        }
    }

    @Override
    public void add(UIComponent uiComponent) {
        uiComponentList.add(uiComponent);
    }

    @Override
    public void remove(UIComponent uiComponent) {
        uiComponentList.remove(uiComponent);
    }
}

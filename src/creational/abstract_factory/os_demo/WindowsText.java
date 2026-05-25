package creational.abstract_factory.os_demo;

public class WindowsText implements Text{
    @Override
    public void render() {
        System.out.println("Windows Text.");
    }

    @Override
    public void onHover() {
        System.out.println("Windows text is been hovered!");
    }
}

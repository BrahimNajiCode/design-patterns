package creational.abstract_factory.os_demo;

public class MacText implements Text{

    @Override
    public void render() {
        System.out.println("Mac Text.");
    }

    @Override
    public void onHover() {
        System.out.println("Mac text is been hovered!");
    }
}

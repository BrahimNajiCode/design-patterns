package creational.abstract_factory.os_demo;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("Mac Button.");
    }

    @Override
    public void onClick() {
        System.out.println("Mac button is clicked!");
    }
}

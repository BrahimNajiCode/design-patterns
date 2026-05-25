package creational.abstract_factory.os_demo;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Windows Button.");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button is clicked!");
    }
}

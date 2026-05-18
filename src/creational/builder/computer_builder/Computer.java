package creational.builder.computer_builder;

public class Computer {
    int RAM;
    String firm;
    int SSD;
    boolean hasCamera;
    public  void show(){
        System.out.println("Type: "+firm+", RAM: "+RAM+", "+SSD+" SSD, has Camera? "+hasCamera);
    }
}

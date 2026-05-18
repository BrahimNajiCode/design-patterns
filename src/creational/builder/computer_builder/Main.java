package creational.builder.computer_builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                .setRAM(16)
                .setFIRM("HP")
                .setSSD(256)
                .setHasCamera(true)
                .build();
        computer.show();
    }
}

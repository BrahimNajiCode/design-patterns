package creational.builder.computer_builder;

public class ComputerBuilder {
    private Computer computer = new Computer();
    public ComputerBuilder setRAM(int RAM){
         computer.RAM = RAM;
         return this;
    }

    public ComputerBuilder setSSD(int SSD){
        computer.SSD = SSD;
        return this;
    }

    public ComputerBuilder setFIRM(String firm){
        computer.firm = firm;
        return this;
    }

    public ComputerBuilder setHasCamera(boolean value){
        computer.hasCamera = value;
        return this;
    }

    public Computer build(){
        return computer;
    }

}

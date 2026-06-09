package behavioral.command.demo;

public class PowerCommand implements Command{
    private Tv tv;

    public PowerCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.powerOn();
    }

    @Override
    public void undo() {
        tv.powerOff();
    }
}

package behavioral.command.demo;

public class MuteCommand implements Command{
    private Tv tv;
    private int volumeBeforeMute;
    public MuteCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        volumeBeforeMute = tv.getVolume();
        tv.setVolume(0);
    }

    @Override
    public void undo() {
        tv.setVolume(volumeBeforeMute);
    }
}

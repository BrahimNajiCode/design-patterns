package behavioral.command.demo;

public class VolumeUpCommand implements Command{

    private Tv tv;
    private int previousVolume;
    public VolumeUpCommand(Tv tv) {
        this.tv = tv;
    }


    @Override
    public void execute() {
        previousVolume = tv.getVolume();
        tv.setVolume(previousVolume+5);
    }

    @Override
    public void undo() {
        tv.setVolume(previousVolume);
    }
}

package creational.singleton.gameSettings;

public class GameSettings {
    private int volume;
    private int brightness;
    private int diffuculty;
    // INSTANCE
    private static GameSettings gameSettings;
    private GameSettings(){}
    public static synchronized GameSettings getInstance(){
        if(gameSettings == null){
            gameSettings = new GameSettings();
        }
        return gameSettings;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getDiffuculty() {
        return diffuculty;
    }

    public void setDiffuculty(int diffuculty) {
        this.diffuculty = diffuculty;
    }
}

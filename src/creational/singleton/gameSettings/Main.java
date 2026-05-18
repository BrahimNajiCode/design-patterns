package creational.singleton.gameSettings;

public class Main {
    public static void main(String[] args) {
        GameSettings g1 = GameSettings.getInstance();
        GameSettings g2 = GameSettings.getInstance();
        g1.setBrightness(100);
        g2.setVolume(80);
        g1.setDiffuculty(50);
        // NOTE: if you watch precisely, you'll notice that I call getters on the opposite of setters (g1 vs g2).
        System.out.println(g2.getBrightness()+", "+g1.getVolume()+", "+g2.getDiffuculty());
    }
}

package structural.flyweight.video_game;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TreeType {
    private String name;
    private String color;
    private byte[] texture;

    public void draw(int x, int y){
        System.out.println("Drawing " + name + " at (" + x + ", " + y + ")");
    }
}

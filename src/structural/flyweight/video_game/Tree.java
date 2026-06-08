package structural.flyweight.video_game;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Tree {
    private int x,y;
    private TreeType treeType;

    public void draw(){
        treeType.draw(x,y);
    }
}


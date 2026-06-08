package structural.flyweight.video_game;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, byte[] texture){
        String key = name + color;

        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color, texture));
            System.out.println("Creating new tree type: " + key);
        } else {
            System.out.println("Reusing tree type: " + key);
        }

        return treeTypes.get(key);
    }
}

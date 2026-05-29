package structural.composite.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> children;

    public Folder(String name){
        this.name = name;
        children = new ArrayList<>();
    }
    public void add(FileSystemComponent f){
        children.add(f);
    }

    @Override
    public void show() {
        int i = 1;
        System.out.println("Folder: "+name);
        for(FileSystemComponent f :children){
            f.show();
        }
    }
}

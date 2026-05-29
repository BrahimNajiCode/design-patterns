package structural.composite.filesystem;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class File implements FileSystemComponent{
    private String name;

    @Override
    public void show() {
        System.out.println("File: "+name);
    }
}

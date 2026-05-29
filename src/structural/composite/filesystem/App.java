package structural.composite.filesystem;

public class App {
    public static void main(String[] args) {
        File f1 = new File("file1.txt");
        File f2 = new File("file2.txt");

        Folder folder = new Folder("Files");
        folder.add(f1); folder.add(f2);
        folder.show();
    }
}

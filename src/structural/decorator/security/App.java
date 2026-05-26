package structural.decorator.security;

public class App {
    public static void main(String[] args) {
        FileService fileService1 = new SecurityDecorator(new BasicFileService(), "ADMIN");
        FileService fileService2 = new SecurityDecorator(new BasicFileService(), "USER");
        fileService2.deleteFile("Hello.txt");
        fileService1.deleteFile("Hello.txt");
    }
}

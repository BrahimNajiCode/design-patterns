package structural.decorator.security;

public class BasicFileService implements FileService{
    @Override
    public void deleteFile(String file) {
        System.out.println("Deleted: "+file);
    }
}

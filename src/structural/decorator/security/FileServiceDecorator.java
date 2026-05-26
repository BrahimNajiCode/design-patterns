package structural.decorator.security;

public abstract class FileServiceDecorator implements FileService{
    protected FileService fileService;

    public FileServiceDecorator(FileService fileService) {
        this.fileService = fileService;
    }

    @Override
    public void deleteFile(String file) {
        fileService.deleteFile(file);
    }
}

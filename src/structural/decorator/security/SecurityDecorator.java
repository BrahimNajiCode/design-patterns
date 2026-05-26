package structural.decorator.security;

public class SecurityDecorator extends FileServiceDecorator{
    private String role;
    public SecurityDecorator(FileService fileService, String role) {
        super(fileService);
        this.role = role;
    }
    @Override
    public void deleteFile(String file){
        if(role.equals("ADMIN")){
            fileService.deleteFile(file);
        }else{
            System.out.println("ACCESS DENIED.");
        }
    }
}

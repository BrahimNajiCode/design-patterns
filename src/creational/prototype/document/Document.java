package creational.prototype.document;

public class Document implements Cloneable{
    private String title;
    private String content;
    private int pagesCount;
    public Document(String title){
        this.title = title;
        System.out.println("Creating document: "+title);
    }
    @Override
    public Document clone(){
        try{
            Document cloned = (Document) super.clone();
            System.out.println("Cloned: "+this.title);
            return cloned;
        }catch(CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }
    // Getters & Setters
    public void setTitle(String title){this.title = title;}
    public void setContent(String content){this.content = content;}
    public String getTitle(){return this.title;}
    public String getContent(){return this.content;}

    @Override
    public String toString(){
        return "Document: "+title;
    }
}

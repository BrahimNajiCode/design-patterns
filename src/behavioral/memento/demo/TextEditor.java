package behavioral.memento.demo;

public class TextEditor {
    private String content;
    // OPERATIONS - Write/ Read/ Save/ Restore[in case of mistake].
    public void write(String text){
        this.content = text;
    }

    public String getContent() {
        return content;
    }

    public TextMemento save(){
        return new TextMemento(content);
    }

    public void restore(TextMemento memento){
        this.content = memento.getContent();
    }
}

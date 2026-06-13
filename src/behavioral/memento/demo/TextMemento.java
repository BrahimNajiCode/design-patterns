package behavioral.memento.demo;

public class TextMemento {
    private final String content;

    public TextMemento(String content) {
        this.content = content;
    }

    public String getContent(){
        return content;
    }

}

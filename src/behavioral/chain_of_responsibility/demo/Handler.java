package behavioral.chain_of_responsibility.demo;

import lombok.Setter;

@Setter
public abstract class Handler {
    protected Handler next;
    public abstract void handle(String req);
}

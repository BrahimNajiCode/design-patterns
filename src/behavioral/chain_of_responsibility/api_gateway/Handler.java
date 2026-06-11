package behavioral.chain_of_responsibility.api_gateway;

import lombok.Setter;

@Setter
public abstract class Handler {
    protected Handler next;

    protected abstract void handle(Request req);
}

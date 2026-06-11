package behavioral.chain_of_responsibility.api_gateway;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Request {
    private String endpoint;
    private String token;
    private String role;
    private String ip;
}

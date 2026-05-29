package structural.facade.api_gateway;

import lombok.AllArgsConstructor;
import lombok.Getter;

// To use lombok annotations, consult /src/lib/lombok.md
@AllArgsConstructor
@Getter
public class User {
    int id;
    String name;
    String role;
    String language;
}

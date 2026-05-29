## How to use Lombok in a NORMAL project (no Maven)
### 1. Download Lombok jar

Go here: 

```
https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.46
```

You get:

> lombok.jar

### 2. Add Lombok to your project manually

> It is preferable to create a `/lib` dirctory in `/src` and place your jars in it, then indicating them as
> Libraries in your project structure.

   In IntelliJ IDEA:
   `File` → `Project Structure` → `Libraries`
   Click `+`
   Add `lombok.jar`


### 3. Enable Annotation Processing (IMPORTANT)

Without this, Lombok won’t work.

IntelliJ:
`Settings` → `Build, Execution, Deployment` → `Compiler` → `Annotation Processors`
✔ Enable annotation processing

### 4. Example usage (after setup)
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
private String name;
private int age;
}
⚠️ Important limitation (normal project)

Without Maven/Gradle:
 
- [x] no auto dependency management
- [x] harder to scale project
- [x] you must manually manage ALL jars (Lombok, MySQL driver, etc.)


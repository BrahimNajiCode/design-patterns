package behavioral.iterator.history;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class URL {
    private final String ROOT = ".";
    // TLD = Top Level Domain (.com, .org, .fr, .ma, etc.)
    private String TLD;
    // SLD =  Second Level Domain (google.com)
    private String SLD;
    // Sub-Domain
    private String subDomain;

    public String getURL(){
        return subDomain+"."+SLD+"."+TLD+ROOT;
    }
}

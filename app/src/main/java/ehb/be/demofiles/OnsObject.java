package ehb.be.demofiles;

import java.io.Serializable;

public class OnsObject implements Serializable {

    private String onzeString;

    public OnsObject() {
    }

    public OnsObject(String onzeString) {
        this.onzeString = onzeString;
    }

    public String getOnzeString() {
        return onzeString;
    }

    public void setOnzeString(String onzeString) {
        this.onzeString = onzeString;
    }
}

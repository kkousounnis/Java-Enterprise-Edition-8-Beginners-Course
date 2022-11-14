package academy.learnprogramming.scopes;

import java.io.Serializable;

public class ApplicationScope implements Serializable {

    private static final long serialVersionUID = 27080464521478L;

    public String getHashCode() {
        return this.hashCode() + " ";
    }
}

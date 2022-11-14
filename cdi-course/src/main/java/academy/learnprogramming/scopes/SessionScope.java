package academy.learnprogramming.scopes;

import java.io.Serializable;

public class SessionScope implements Serializable {
    private static final long serialVersionUID = 440804699990999L;

    public String getHashCode() {
        return this.hashCode() + " ";
    }

}

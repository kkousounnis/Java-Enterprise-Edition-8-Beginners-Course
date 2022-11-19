package academy.learnprogramming.scopes;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;

@ApplicationScoped
public class ApplicationScope implements Serializable {

    private static final long serialVersionUID = 27080464521478L;

    public String getHashCode() {
        System.err.println("This is third step 3.");
        return this.hashCode() + " ";
    }
}

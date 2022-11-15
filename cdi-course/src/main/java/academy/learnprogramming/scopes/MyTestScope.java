package academy.learnprogramming.scopes;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class MyTestScope {

    public String getHashCode() {
        return this.hashCode() + " MyTest Case";
    }
}

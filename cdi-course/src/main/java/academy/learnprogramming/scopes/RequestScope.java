package academy.learnprogramming.scopes;


import javax.enterprise.context.RequestScoped;

/**
 * @author KonstantinosK
 */
@RequestScoped
public class RequestScope {

    public String getHashCode() {
        return this.hashCode() + " ";
    }

}

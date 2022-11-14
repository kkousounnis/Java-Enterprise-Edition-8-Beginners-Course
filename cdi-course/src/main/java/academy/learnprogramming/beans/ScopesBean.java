package academy.learnprogramming.beans;

import academy.learnprogramming.scopes.DependentScope;
import academy.learnprogramming.scopes.RequestScope;

import java.io.Serializable;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 * @author KonstantinosK
 */

public class ScopesBean implements Serializable {

    @Inject
    private RequestScope requestScope;

    private DependentScope dependentScope;

    private ScopesBean(DependentScope dependentScope) {
        this.dependentScope = dependentScope;
    }


}

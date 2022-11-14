package academy.learnprogramming.beans;

import academy.learnprogramming.annotations.Web;
import academy.learnprogramming.scopes.ApplicationScope;
import academy.learnprogramming.scopes.DependentScope;
import academy.learnprogramming.scopes.RequestScope;
import academy.learnprogramming.scopes.SessionScope;
import academy.learnprogramming.sessionbeans.AuditedService;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

/**
 * @author KonstantinosK
 */
@Web
public class ScopesBean implements Serializable {

    //Field injection point
    @Inject
    private RequestScope requestScope;

    @Inject
    private ApplicationScope applicationScope;

    @Inject
    private AuditedService auditedService;


    //Producer Object
    @Inject
    private Logger logger;


    private SessionScope sessionScope;

    private DependentScope dependentScope;





    //Lifecycle callback
    @PostConstruct
    private void init() {
        auditedService.auditedMethod();
        logger.log(Level.INFO, "*********************************************************");
        logger.log(Level.INFO, "Scopes bean called");
        logger.log(Level.INFO, "*********************************************************");
    }


    @PreDestroy
    private void kill() {
        logger.log(Level.INFO, "*********************************************************");
        logger.log(Level.INFO, "Scopes bean gonna be killed :-( ");
        logger.log(Level.INFO, "*********************************************************");
    }

    //Costructor injection point
    @Inject
    private ScopesBean(DependentScope dependentScope) {
        this.dependentScope = dependentScope;
    }


    //Method injection point
    @Inject
    private void setSessionScope(SessionScope sessionScope) {
        this.sessionScope = sessionScope;
    }

    public String applicationScopeHashCode() {
        return applicationScope.getHashCode();
    }

    public String sessionScopeHashCode() {
        return sessionScope.getHashCode();
    }

    public String dependentScopeHashCode() {
        return dependentScope.getHashCode();
    }

}

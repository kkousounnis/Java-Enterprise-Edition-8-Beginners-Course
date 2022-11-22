package academy.learnprogramming.events;

import javax.annotation.Priority;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.interceptor.Interceptor;
import java.util.logging.Level;
import java.util.logging.Logger;

@RequestScoped
public class EventPriority {

    @Inject
    Logger logger;

    void greetingReceiver1(@Observes @Priority(Interceptor.Priority.APPLICATION + 200) String greeting) {
        logger.log(Level.INFO, "Greeting 1 with lower priority invoked with message " + greeting + "1");

    }

    //Higher priority
    void greetingReceiver2(@Observes @Priority(Interceptor.Priority.APPLICATION) String greeting) {
        logger.log(Level.INFO, "Greeting 2 with higher priority invoked with message " + greeting + "2");
    }
}

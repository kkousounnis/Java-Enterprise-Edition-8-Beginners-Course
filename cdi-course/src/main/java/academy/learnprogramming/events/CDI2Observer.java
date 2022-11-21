package academy.learnprogramming.events;


import javax.annotation.Priority;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;

@ApplicationScoped
public class CDI2Observer {

    @Inject
    Logger logger;

    private String greeting;

    void greetingReceiver1(@Observes @Priority(200) String greeting) {

    }

    void greetingReceiver2(@Observes @Priority(100) String greeting) {
        logger.log(Level.INFO, "Greeting 2 with higher priority invoked with message " + greeting);
    }

}

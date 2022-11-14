package academy.learnprogramming.events;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.logging.Logger;

public class EventObserver implements Serializable {

    @Inject
    private Logger logger;

    
}

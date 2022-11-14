package academy.learnprogramming.produces;

import javax.enterprise.inject.spi.InjectionPoint;
import javax.ws.rs.Produces;
import java.util.logging.Logger;

public class LoggerProducer {

    @Produces
    public Logger produceLogger(InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }

}

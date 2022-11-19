
package academy.learnprogramming.producers;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.logging.Logger;

public class LoggerProducer {

    @Produces
    public Logger produceLogger(InjectionPoint injectionPoint) {
        System.err.println(injectionPoint.getMember().getDeclaringClass().getName()+"<- Kwstas class name");
        System.err.println("This the first step 1.");
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }
}

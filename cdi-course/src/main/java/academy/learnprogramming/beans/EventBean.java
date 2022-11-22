package academy.learnprogramming.beans;

import academy.learnprogramming.annotations.Admin;
import academy.learnprogramming.annotations.PopularStand;
import academy.learnprogramming.annotations.Web;
import academy.learnprogramming.events.EventData;
import academy.learnprogramming.events.User;

import javax.enterprise.event.Event;
import javax.enterprise.inject.spi.Extension;
import javax.inject.Inject;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.CompletionStage;

@Web
public class EventBean {


    @Inject
    private User user;

    @Inject
    Event<String> greetingEvent;

    @Inject
    Event<EventData> plainEvent;

    @Inject
    @PopularStand
    private Event<EventData> eventDataEvent;

    @Inject
    @Admin
    private Event<EventData> conditionalEvent;



    public void login() {
        //Do credentials checking to login in user then fire login event
        //someSecurityManager.loginUser(user.getEmail, user.getPassword)

        greetingEvent.fire("Hello from priority");

        plainEvent.fire(new EventData(user.getEmail(), LocalDateTime.now()));




        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        eventDataEvent.fire(new EventData(user.getEmail(), LocalDateTime.now()));


        CompletionStage<EventData> fireAsync = eventDataEvent.fireAsync(new EventData(user.getEmail(), LocalDateTime.now()));




        long secs = ChronoUnit.SECONDS.between(now, LocalDateTime.now());

        System.out.println("It took us this number of seconds to login " + secs);

        //Qualified Observer
        conditionalEvent.fire(new EventData(user.getEmail(), LocalDateTime.now()));

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

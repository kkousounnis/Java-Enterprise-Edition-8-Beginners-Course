package academy.learnprogramming.sessionbeans;

import academy.learnprogramming.annotations.ServiceMan;
import academy.learnprogramming.interfaces.Salute;

import javax.ejb.Stateless;
import java.text.MessageFormat;

@Stateless
@ServiceMan(value = ServiceMan.ServiceType.SOLDIER)
@academy.learnprogramming.annotations.Soldier
public class Soldier implements Salute {

    public String salute(String name) {
        return MessageFormat.format("Aya Aya Capt {0}", name);
    }
}

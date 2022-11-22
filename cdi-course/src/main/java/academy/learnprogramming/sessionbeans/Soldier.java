package academy.learnprogramming.sessionbeans;

import academy.learnprogramming.interfaces.Salute;
import academy.learnprogramming.annotations.ServiceMan;

import javax.ejb.Stateless;
import java.text.MessageFormat;

@Stateless
@ServiceMan(value = ServiceMan.ServiceType.SOLDIER)
@academy.learnprogramming.annotations.Soldier
public class Soldier implements Salute {

    @Override
    public String salute(String name) {
        return MessageFormat.format("Aye Aye Capt {0}", name);
    }

}

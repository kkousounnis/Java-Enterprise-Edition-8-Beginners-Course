package academy.learnprogramming.scopes;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Random;

@Named
public class LuckyDishRaffle {

    @Inject
    private List<String> luckyDishes;

    private final Random random = new Random();

    public String getYourLuckyDish() {
        // Print next int value
        // Returns number between 0-7
        return luckyDishes.get(random.nextInt(8));
    }

}

package example.codeclan.com.prison;

/**
 * Created by user on 18/07/2017.
 */

public class SteakPie implements Food {
    private int calories = 350;


    @Override
    public int getNutritionalValue() {
        return calories;
    }
}

package example.codeclan.com.prison;

/**
 * Created by user on 18/07/2017.
 */

public class FishPie implements Food {
    private int calories = 250;


    @Override
    public int getNutritionalValue() {
        return calories;
    }

}

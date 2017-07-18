package example.codeclan.com.prison;

/**
 * Created by user on 18/07/2017.
 */

public class ApplePie implements Food {
    private int calories = 400;


    @Override
    public int getNutritionalValue() {
        return calories;
    }

}

package example.codeclan.com.prison;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/07/2017.
 */

public class KitchenTest {

    Kitchen kitchen;

    @Before
    public void before(){
        kitchen = new Kitchen(1, 3, 5);
    }

    @Test
    public void canGetSmallMeal(){
        assertEquals(1, kitchen.getSmallMeal());
    }

    @Test
    public void canGetMedMeal(){
        assertEquals(3, kitchen.getMedMeal());
    }

    @Test
    public void canGetLargeMeal(){
        assertEquals(5, kitchen.getLargeMeal());
    }

    @Test
    public void canSetSmallMealValue(){
        kitchen.setSmallMealValue(2);
        assertEquals(2, kitchen.getSmallMeal());
    }

    @Test
    public void canSetMedMealValue(){
        kitchen.setMedMealValue(4);
        assertEquals(4, kitchen.getMedMeal());
    }

    @Test
    public void canSetLargeMealValue(){
        kitchen.setLargeMealValue(6);
        assertEquals(6, kitchen.getLargeMeal());
    }



}

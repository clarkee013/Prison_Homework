package example.codeclan.com.prison;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/07/2017.
 */

public class PrisonerTest {

    Prisoner prisoner;
    SteakPie steakPie;
    FishPie fishPie;
    ApplePie applePie;

    @Before
    public void before(){
        prisoner = new Prisoner(13, "David", true);
        steakPie = new SteakPie();
        fishPie = new FishPie();
        applePie = new ApplePie();
    }

    @Test
    public void canGetId(){
        assertEquals(13, Prisoner.getId());
    }

    @Test
    public void canGetName(){
        assertEquals("David", Prisoner.getName());
    }

    @Test
    public void canGetViolent(){
        assertEquals(true, Prisoner.getViolent());
    }

    @Test
    public void canSetId(){
        prisoner.setId(12);
        assertEquals(12, Prisoner.getId());
    }

    @Test
    public void canSetName(){
        prisoner.setName("Chris");
        assertEquals("Chris", Prisoner.getName());
    }


    @Test
    public void canSetViolent(){
        prisoner.setViolent(false);
        assertEquals(false, Prisoner.getViolent());
    }

    @Test
    public void canGetStomachSize(){
        assertEquals(0, prisoner.getStomachSize());
    }

    @Test
    public void canEatSteakPie(){
        prisoner.haveKip();
        prisoner.eatFood(steakPie);
        assertEquals(1, prisoner.getStomachSize());
    }

    @Test
    public void canEatFishPie(){
        prisoner.haveKip();
        prisoner.eatFood(fishPie);
        assertEquals(1, prisoner.getStomachSize());
    }

    @Test
    public void canEatApplePie(){
        prisoner.haveKip();
        prisoner.eatFood(applePie);
        assertEquals(1, prisoner.getStomachSize());
    }

    @Test
    public void canHaveKip(){
        prisoner.eatFood(steakPie);
        prisoner.haveKip();
        assertEquals(0, prisoner.getStomachSize());
    }

    @Test
    public void canGetNutritionalValue_steakPie() {
        prisoner.eatFood(steakPie);
        assertEquals(350, prisoner.getTotalNutritionalValue());
    }

    @Test
    public void canGetNutritionalValue_fishPie() {
        prisoner.eatFood(fishPie);
        assertEquals(250, prisoner.getTotalNutritionalValue());
    }

    @Test
    public void canGetNutritionalValue_cherryPie() {
        prisoner.eatFood(applePie);
        assertEquals(400, prisoner.getTotalNutritionalValue());
    }

    @Test
    public void canGetTotalNutritionalValue_allThePies() {
        prisoner.eatFood(steakPie);
        prisoner.eatFood(fishPie);
        prisoner.eatFood(applePie);
        assertEquals(1000, prisoner.getTotalNutritionalValue());
    }






}

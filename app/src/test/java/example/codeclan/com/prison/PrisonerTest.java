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

    @Before
    public void before(){
        prisoner = new Prisoner(13, "David", 5, 2, true);
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
    public void canGetStomachCapacity(){
        assertEquals(5, Prisoner.getStomachCapacity());
    }

    @Test
    public void canGetHungerLevel(){
        assertEquals(2, Prisoner.getHungerLevel());
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
    public void canSetStomachCapacity(){
        prisoner.setStomachCapacity(6);
        assertEquals(6, Prisoner.getStomachCapacity());
    }

    @Test
    public void canSetHungerLevel(){
        prisoner.setHungerLevel(2);
        assertEquals(2, Prisoner.getHungerLevel());
    }

    @Test
    public void canSetViolent(){
        prisoner.setViolent(false);
        assertEquals(false, Prisoner.getViolent());
    }






}

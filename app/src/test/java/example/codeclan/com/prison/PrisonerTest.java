package example.codeclan.com.prison;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/07/2017.
 */

public class PrisonerTest {

    Prisoner prisoner;

    @Before
    public void before(){
        prisoner = new Prisoner(13, "David", 5, true);
    }

    @Test
    public void canGetId(){
        assertEquals(13, prisoner.getId());
    }

    @Test
    public void canGetName(){
        assertEquals("David", prisoner.getName());

    }

    @Test
    public void canGetStomachCapacity(){
        assertEquals(5, prisoner.getStomachCapacity());
    }

    @Test
    public void canGetViolent(){
        assertEquals(true, prisoner.getViolent());
    }

    @Test
    public void canSetId(){
        prisoner.setId(12);
        assertEquals(12, prisoner.getId());
    }

    @Test
    public void canSetName(){
        prisoner.setName("Chris");
        assertEquals("Chris", prisoner.getName());
    }

    @Test
    public void canSetStomachCapacity(){
        prisoner.setStomachCapacity(6);
        assertEquals(6, prisoner.getStomachCapacity());
    }

    @Test
    public void canSetViolent(){
        prisoner.setViolent(false);
        assertEquals(false, prisoner.getViolent());
    }




}

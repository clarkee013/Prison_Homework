package example.codeclan.com.prison;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/07/2017.
 */

public class PrisonTest {

    Prison prison;
    Cell cell;
    Visitor visitor;

    @Before
    public void before(){
        prison = new Prison();
        visitor = new Visitor(1313, "John");
    }


    @Test
    public void canGetPrisonSize(){
        assertEquals(0, prison.getPrisonSize());
    }

    @Test
    public void canAddCellToPrison(){
        prison.addCellToPrison(cell);
        assertEquals(1, prison.getPrisonSize());
    }

    @Test
    public void canClearCellsFromPrison(){
        prison.addCellToPrison(cell);
        assertEquals(1, prison.getPrisonSize());
    }


}

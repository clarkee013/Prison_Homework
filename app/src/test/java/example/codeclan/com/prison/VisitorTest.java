package example.codeclan.com.prison;

import org.junit.Before;
import org.junit.Test;

import static android.R.attr.name;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/07/2017.
 */

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(1313, "Mick");
    }

    @Test
    public void canGetVisitingOrder(){
        assertEquals(1313, visitor.getVisitingOrder());
    }

    @Test
    public void canSetVisitingOrder(){
        visitor.setVisitingOrder(3131);
        assertEquals(3131, visitor.getVisitingOrder());
    }

    @Test
    public void canGetName(){
        assertEquals("Mick", visitor.getName());
    }

    @Test
    public void canSetName(){
        visitor.setName("Chris");
        assertEquals("Chris", visitor.getName());
    }
}

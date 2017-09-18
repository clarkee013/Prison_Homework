package example.codeclan.com.prison;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor("Fee");

    }

    @Test
    public void canGetName() {
        assertEquals("Fee", visitor.getName());
    }

    @Test
    public void canSetName(){
        visitor.setName("Chris");
        assertEquals("Chris", visitor.getName());
    }

}
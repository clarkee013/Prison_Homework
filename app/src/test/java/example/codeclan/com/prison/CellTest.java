package example.codeclan.com.prison;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/07/2017.
 */

public class CellTest {

    Cell cell;

    @Before
    public void before(){
        cell = new Cell(1, 4);
    }

    @Test
    public void canGetCellId(){
        assertEquals(1, cell.getCellId());
    }

    @Test
    public void canGetCellCapacity(){
        assertEquals(4, cell.getCellCapacity());
    }

    @Test
    public void canSetCellId(){
        cell.setCellId(2);
        assertEquals(2, cell.getCellId());
    }

    @Test
    public void canSetCellCapacity(){
        cell.setCellCapacity(2);
        assertEquals(2, cell.getCellCapacity());
    }




}


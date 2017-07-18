package example.codeclan.com.prison;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/07/2017.
 */

public class CellTest {

    Cell cell;
    Prisoner prisoner;

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

    @Test
    public void canGetNumberOfPrisoners(){
        assertEquals(0, cell.getNumberOfPrisoners());
    }

    @Test
    public void canClearCell(){
        cell.addPrisoner(prisoner);
        cell.emptyCell();
        assertEquals(0, cell.getNumberOfPrisoners());
    }
// TODO add in capacity & violent prisoner conditions to the add prisoner to cell method
    // if prisoners if smaller than capacity, add prisoner, if not...? null?
    // then add in the violent condition.
    // also need to check if prisoner is violent - at add level of cell level - or both?




}

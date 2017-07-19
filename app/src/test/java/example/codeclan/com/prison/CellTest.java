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
        prisoner = new Prisoner(13, "David", true);
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
    public void canAddPrisoner(){
        cell.addPrisoner(prisoner);
        assertEquals(1, cell.getNumberOfPrisoners());
    }

    @Test
    public void canClearCell(){
        cell.addPrisoner(prisoner);
        cell.emptyCell();
        assertEquals(0, cell.getNumberOfPrisoners());
    }

    @Test
    public void canCheckForViolentPrisoners(){
        cell.addPrisoner(prisoner);
        assertEquals(true, cell.checkForViolentPrisoners());
    }

    @Test
    public void canCapacityCheckToAddPrisoner(){
        cell.emptyCell();
        cell.addPrisoner(prisoner);
        assertEquals(true, cell.capacityCheckToAddPrisoner());
    }

    @Test
    public void canCheckViolentPrisonerToAddPrisoner(){
        cell.emptyCell();
        cell.addPrisoner(prisoner);
        assertEquals(false, cell.violentPrisonerCheckToAddPrisoner(prisoner));
    }








// TODO add in capacity & violent prisoner conditions to the add prisoner to cell method
// TODO if prisoners if smaller than capacity, add prisoner, if not...? null?
// TODO then add in the violent condition.
// TODO also need to check if prisoner is violent - at add level of cell level - or both?




}

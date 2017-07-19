package example.codeclan.com.prison;

import java.util.ArrayList;

/**
 * Created by user on 18/07/2017.
 */

public class Prison {

    Cell cell;
    private ArrayList<Cell> cells;


    public Prison(){
        this.cells = new ArrayList<Cell>();

    }

    public int getPrisonSize() {
        return cells.size();
    }

    public void addCellToPrison(Cell cell) {
        cells.add(cell);
    }

}


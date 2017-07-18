package example.codeclan.com.prison;

import java.util.ArrayList;

/**
 * Created by user on 17/07/2017.
 */

public class Cell {

    private static int id;
    private static int capacity;
    private ArrayList<Prisoner> prisoners;


    public Cell(int id, int capacity){
        this.id = id;
        this.capacity = capacity;
        this.prisoners = new ArrayList<Prisoner>();
    }


    public static int getCellId() {
        return id;
    }

    public static int getCellCapacity() {
        return capacity;
    }

    public void setCellId(int id) {
        this.id = id;
    }

    public void setCellCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfPrisoners(){
        return prisoners.size();
    }

    public void addPrisoner(Prisoner prisoner) {
        prisoners.add(prisoner);
    }

    public void emptyCell() {
        prisoners.clear();
    }



}



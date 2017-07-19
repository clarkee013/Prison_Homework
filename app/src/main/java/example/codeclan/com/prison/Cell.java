package example.codeclan.com.prison;

import java.util.ArrayList;


/**
 * Created by user on 17/07/2017.
 */

public class Cell {

    Prisoner prisoner;

    private int id;
    private int capacity;
    private ArrayList<Prisoner> prisoners;


    public Cell(int id, int capacity){
        this.id = id;
        this.capacity = capacity;
        this.prisoners = new ArrayList<Prisoner>();
    }


    public int getCellId() {
        return id;
    }

    public int getCellCapacity() {
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

    public boolean checkForViolentPrisoners() {
         for (Prisoner prisoner : prisoners) {
             if (prisoner.getViolent()) {
                 return true;
             }
         }
         return false;
    }


    public boolean capacityCheckToAddPrisoner() {
        if (getNumberOfPrisoners() <= capacity){
            return true;
        }
        return false;
    }

    public boolean violentPrisonerCheckToAddPrisoner() {
        if (!checkForViolentPrisoners() && prisoner.getViolent()){
            return true;
        }
        return false;
    }

    public boolean prisonerWithCapacityAndViolentCheck() {
        if (capacityCheckToAddPrisoner() && !violentPrisonerCheckToAddPrisoner()) {
            return true;
        }
        return false;
    }

}



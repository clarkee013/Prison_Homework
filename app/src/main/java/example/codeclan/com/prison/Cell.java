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

    public boolean checkForViolentPrisoners() {
        for (Prisoner prisoner : prisoners) {
            if (prisoner.getViolent()){
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

    public boolean violentPrisonerCheckToAddPrisoner(Prisoner prisoner) {
        if (!checkForViolentPrisoners() && prisoner.getViolent()){
            return true;
        }
        return false;
    }


// TODO if number of prisoners is less than capacity add prisoner
// TODO if number of prisoners is less than capacity and prisoner is not violent
// TODO get the checkForViolentPrisoners method checked - not sure if the true is false and false is true...
// TODO ... situation is happening like i had with the TO DO list


}



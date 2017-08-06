package example.codeclan.com.prison;

import java.util.ArrayList;

/**
 * Created by user on 17/07/2017.
 */

public class Prisoner extends Human {

    private int id;
    private ArrayList<Food> stomach;
    private boolean violent;

    public Prisoner(int id, String name, boolean violent){
        super(name);
        this.id = id;
        this.stomach = new ArrayList<Food>();
        this.violent = violent;
    }

    public int getId() {
        return id;
    }

    public boolean getViolent() {
        return violent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setViolent(boolean violent) {
        this.violent = violent;
    }

    public int getStomachSize() {
        return stomach.size();
    }

    public void eatFood(Food food) {
        stomach.add(food);
    }

    public void haveKip() {
        stomach.clear();
    }


    public int getTotalNutritionalValue() {
        int total = 0;
        for (Food food : stomach){
            total += food.getNutritionalValue();
        }
        return total;
    }


}




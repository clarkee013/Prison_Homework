package example.codeclan.com.prison;

import java.util.ArrayList;

/**
 * Created by user on 17/07/2017.
 */

public class Prisoner {

    private static int id;
    private static String name;
    private ArrayList<Food> stomach;
    private static boolean violent;


    public Prisoner(int id, String name, boolean violent){
        this.id = id;
        this.name = name;
        this.stomach = new ArrayList<Food>();
        this.violent = violent;

    }

    public static String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public static boolean getViolent() {
        return violent;
    }

    public void setName(String name) {
        this.name = name;
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




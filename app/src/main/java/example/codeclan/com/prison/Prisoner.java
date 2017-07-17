package example.codeclan.com.prison;

/**
 * Created by user on 17/07/2017.
 */

public class Prisoner {

    private static int id;
    private static String name;
    private static int stomachCapacity;
    private static int hungerLevel;
    private static boolean violent;
    Kitchen kitchen;

    public Prisoner(int id, String name, int stomachCapacity, int hungerLevel, boolean violent){
        this.id = id;
        this.name = name;
        this.stomachCapacity = stomachCapacity;
        this.hungerLevel = hungerLevel;
        this.violent = violent;

    }

    public static String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public static int getStomachCapacity() {
        return stomachCapacity;
    }

    public static int getHungerLevel(){
        return hungerLevel;
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

    public void setStomachCapacity(int stomachCapacity) {
        this.stomachCapacity = stomachCapacity;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setViolent(boolean violent) {
        this.violent = violent;
    }


}

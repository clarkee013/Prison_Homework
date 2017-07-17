package example.codeclan.com.prison;

/**
 * Created by user on 17/07/2017.
 */

public class Prisoner {

    private static int id;
    private static String name;
    private static int stomachCapacity;
    private static boolean violent;

    public Prisoner(int id, String name, int stomachCapacity, boolean violent){
        this.id = id;
        this.name = name;
        this.stomachCapacity = stomachCapacity;
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

    public void setViolent(boolean violent) {
        this.violent = violent;
    }
}

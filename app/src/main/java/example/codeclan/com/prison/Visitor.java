package example.codeclan.com.prison;

/**
 * Created by user on 19/07/2017.
 */

public class Visitor extends Human {

    private int visitingOrder;


    public Visitor(int visitingOrder, String name) {
        super(name);
        this.visitingOrder = visitingOrder;
    }

    public int getVisitingOrder() {
        return visitingOrder;
    }

    public void setVisitingOrder(int visitingOrder) {
        this.visitingOrder = visitingOrder;
    }



}

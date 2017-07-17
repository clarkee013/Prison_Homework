package example.codeclan.com.prison;

/**
 * Created by user on 17/07/2017.
 */

public class Kitchen {

    private int smallMeal;
    private int medMeal;
    private int largeMeal;

    public Kitchen(int smallMeal, int medMeal, int largeMeal){
        this.smallMeal = smallMeal;
        this.medMeal = medMeal;
        this.largeMeal = largeMeal;
    }

    public int getSmallMealValue() {
        return smallMeal;
    }

    public int getMedMealValue() {
        return medMeal;
    }

    public int getLargeMealValue() {
        return largeMeal;
    }

    public void setSmallMealValue(int smallMeal) {
        this.smallMeal = smallMeal;
    }

    public void setMedMealValue(int medMeal) {
        this.medMeal = medMeal;
    }

    public void setLargeMealValue(int largeMeal) {
        this.largeMeal = largeMeal;
    }


}






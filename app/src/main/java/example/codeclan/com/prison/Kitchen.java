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

    public int getSmallMeal() {
        return smallMeal;
    }

    public int getMedMeal() {
        return medMeal;
    }

    public int getLargeMeal() {
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






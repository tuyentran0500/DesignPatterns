package InterviewQuestions.DesignPizza;

public class PercentageDiscountPromotion implements Promotion {
    private double percentages;
    public PercentageDiscountPromotion(double percentages){
        this.percentages = percentages; 
    }
    @Override
    public double apply(Pizza pizza, double price) {
        return price - (price * (percentages / 100));
    }
}

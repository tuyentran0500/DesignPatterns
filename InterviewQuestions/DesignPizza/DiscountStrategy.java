package InterviewQuestions.DesignPizza;

public class DiscountStrategy implements PricingStrategy {
    public DiscountStrategy(){
    }
    @Override
    public double getPrice(Pizza pizza) {
        // TODO Auto-generated method stub
        double basePrice = new SimplePricingStrategy().getPrice(pizza);
        if (pizza.getToppings().size() >= 3){
            return basePrice * 0.8;
        }
        return basePrice;
    }
}

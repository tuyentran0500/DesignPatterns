package InterviewQuestions.DesignPizza;
public class SimplePricingStrategy implements PricingStrategy{
    public SimplePricingStrategy(){
        
    }
    @Override
    public double getPrice(Pizza pizza) {
        // TODO Auto-generated method stub
        double basePrice = switch (pizza.getSize()) {
            case SMALL -> 8.0;
            case MEDIUM -> 10.0;
            case LARGE -> 12.0;
        };

        double crustPrice = switch (pizza.getCrust()) {
            case THIN -> 1.0;
            case REGULAR -> 1.5;
            case STUFFED -> 2.0;
        };

        double ans = basePrice + crustPrice;

        for (Topping topping : pizza.getToppings()){
            ans += topping.getPrice();
        }
        return ans;
    }
}

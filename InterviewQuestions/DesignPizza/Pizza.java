package InterviewQuestions.DesignPizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private PizzaSize size;
    private CrustType crust;
    private List<Topping> toppings;
    private PricingStrategy pricingStrategy;
    public PizzaSize getSize() {
        return size;
    }
    public CrustType getCrust() {
        return crust;
    }
    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public List<Topping> getToppings() {
        return toppings;
    };
    public Pizza(PizzaSize size, CrustType crust, PricingStrategy pricingStrategy){
        this.size = size;
        this.crust = crust;
        this.pricingStrategy = pricingStrategy;
        toppings = new ArrayList<Topping>();
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public double getPrize(){
        return pricingStrategy.getPrice(this);
    }
}

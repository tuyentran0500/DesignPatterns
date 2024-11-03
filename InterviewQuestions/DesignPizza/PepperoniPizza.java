package InterviewQuestions.DesignPizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza(PizzaSize pizzaSize, CrustType crustType, PricingStrategy pricingStrategy){
        super(pizzaSize, crustType, pricingStrategy);
        addTopping(new Topping("Pepperoni", 20));
        addTopping(new Topping("Cheese", 30));
    }
}

package InterviewQuestions.DesignPizza;


public class PizzaFactory {
    public PizzaFactory(){

    }
    public static Pizza createPizza(String pizzaType, PizzaSize pizzaSize, CrustType crustType, PricingStrategy pricingStrategy){
        switch (pizzaType) {
            case "pepperoni":
                return new PepperoniPizza(pizzaSize, crustType, pricingStrategy);
            case "veggie":
                return new VeggiePizza(pizzaSize, crustType, pricingStrategy);
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}

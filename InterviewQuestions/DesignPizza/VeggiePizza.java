package InterviewQuestions.DesignPizza;

class VeggiePizza extends Pizza {
    public VeggiePizza(PizzaSize size, CrustType crust, PricingStrategy pricingStrategy) {
        super(size, crust, pricingStrategy);
        addTopping(new Topping("Mushrooms", 5.0));
        addTopping(new Topping("Olives", 3.0));
        addTopping(new Topping("Peppers", 2.0));
    }
}
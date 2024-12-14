package InterviewQuestions.DesignPizza;

public class PizzaShop {
    public static void main(String[] args) {
        PricingStrategy simpleStrategy = new SimplePricingStrategy();
        PricingStrategy discountedStrategy = new DiscountStrategy();
    
        Pizza myPizza = new Pizza(PizzaSize.MEDIUM, CrustType.STUFFED, discountedStrategy);
        myPizza.addTopping(new Topping("Pepperoni", 10.0));
        myPizza.addTopping(new Topping("Mushrooms", 5.0));
        myPizza.addTopping(new Topping("Onions", 3.0));
        myPizza.addTopping(new Topping("Olives", 2.0));
        
        System.out.println("Total price with discount: " + myPizza.getPrize());


        myPizza = new Pizza(PizzaSize.MEDIUM, CrustType.STUFFED, simpleStrategy);
        myPizza.addTopping(new Topping("Pepperoni", 10.0));
        myPizza.addTopping(new Topping("Mushrooms", 5.0));
        myPizza.addTopping(new Topping("Onions", 3.0));
        myPizza.addTopping(new Topping("Olives", 2.0));
        
        System.out.println("Total price without discount: " + myPizza.getPrize());

        // Factory


        myPizza = PizzaFactory.createPizza("pepperoni", PizzaSize.MEDIUM, CrustType.REGULAR, simpleStrategy);
        System.out.println("Total price for Pepperoni Pizza: " + myPizza.getPrize());
    
        Pizza veggiePizza = PizzaFactory.createPizza("veggie", PizzaSize.LARGE, CrustType.STUFFED, simpleStrategy);
        System.out.println("Total price for Veggie Pizza: " + veggiePizza.getPrize());
    }
    
}

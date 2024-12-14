Pizza:
- Size: small, medium, large
- Crust: Thin, Regular, Stuffed
- Toppings: Multiple type of Toppings.


enum PizaSize {
    SMALL(1.0), MEDIUM(2.0), LARGE(3.0)
}

enum CrustType {
    THIN(20.0), REGULAR(30.9), STUFFED(60.0)
}
public class Topping {
    String name;
    double price;
    public Topping(String name, double price){

    }

    public double getPrice(){
        return price; 
    }
}

PepperoryTopping = new Topping("Pepperory", 10.0);

public class Pizza {
    private PizzaSize size;
    private CrustType crust;
    private List<Topping> toppings;
    public Pizze(PizzaSize size, CrustType crust){
        this.size = size;
        this.crust = crust;
        toppings = new ArrayList<Topping>();
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    o
    public double getPrize(){
        double ans = 0;
        double basePrice = switch (size) {
            case SMALL -> 8.0;
            case MEDIUM -> 10.0;
            case LARGE -> 12.0;
        };

        double crustPrice = switch (crust) {
            case THIN -> 1.0;
            case REGULAR -> 1.5;
            case STUFFED -> 2.0;
        };
        for (Topping topping : toppings){
            ans += topping.getPrice();
        }
        returnn ans;
    }

}


**NOTE**:
- 
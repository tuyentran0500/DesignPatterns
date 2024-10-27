package Strategy;

public class DuckSimulator {
    public static void main(String[] args) {
        // Create a MallardDuck instance and display it
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly(); // Should fly with wings

        System.out.println(); // Just for better output formatting

        // Create a ModelDuck instance and display it
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly(); // Should not be able to fly

        // Change behavior of model duck at runtime
        System.out.println(); // Just for better output formatting
        System.out.println("Changing ModelDuck's flying behavior...");
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly(); // Now it can fly
    }
}
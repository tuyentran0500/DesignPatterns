Note:
- Duck class dont need to be abstract  
- Behavior is interface
```
// FlyBehavior interface
public interface FlyBehavior {
    void fly();
}

// Concrete fly behavior classes
class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}

class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}

// Duck abstract class
abstract class Duck {
    protected FlyBehavior flyBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }
}

// Concrete Duck classes
class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings(); // Default behavior
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck!");
    }
}

class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay(); // Default behavior
    }

    @Override
    public void display() {
        System.out.println("I'm a Model Duck!");
    }
}

// Client code to test the Fly Behavior
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
```
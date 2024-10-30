### Key Concepts of the Decorator Pattern

- **Component**: An interface or abstract class that defines the object’s behavior.
- **Concrete Component**: A class that implements the Component interface. This is the object we want to decorate.
- **Decorator**: A class that implements the Component interface and contains a reference to a Component object. It delegates behavior to the wrapped object and can add additional behavior.
1. **Components**

```java
public interface Coffee {
	String getDescription();
	double cost();
}
```

1. **Concrete Components**

```java
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 2.00; // base cost
    }
}

```

1. **Decorator**

```java
public abstract class CoffeeDecorator implements Coffee {
	protected Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee coffee){
		this.decoratorCoffee = coffee;
	}
	
	 @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }
}
```

1. Concrete Decorator Patterns

```java
public class MilkDecorator extends Coffee Decorator {
	public MilkDecorator(Coffee coffee){
		super(coffee);
	}
	
	@Override
	public String getDescriptions() {
		return decoratedCoffee.getDescription() + ", sugar";
	}
	
	@Override 
	public double cost(){
		return decoratedCoffee.cost() + 2.0;
	}
}
```
SugarDecorator
```java
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.20; // additional cost for sugar
    }
}
```
Example
```java
public class CoffeeShop {
    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());

        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());

        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());
    }
}
```
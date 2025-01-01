package Prototype;

public class Main {
    public static void main(String[] args) {
        // Original object
        Circle originalCircle = new Circle(5, "Red");

        // Clone the object
        Circle clonedCircle = (Circle) originalCircle.clone();

        // Modify the clone
        clonedCircle.setColor("Blue");

        // Print original and cloned objects
        System.out.println("Original: " + originalCircle);
        System.out.println("Cloned: " + clonedCircle);
    }
}

package Flyweight;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree(1, 2, "Oak", "Green");
        forest.plantTree(3, 4, "Oak", "Green");
        forest.plantTree(5, 6, "Pine", "Dark Green");

        forest.draw();
    }
}

package Flyweight;

public class TreeType {
    private String type;
    private String color;
    public TreeType(String type, String color){
        this.type = type;
        this.color = color;
    }

    public void draw(int positionX, int positionY) {
        System.out.println("Drawing " + type + " tree of color " + color + " at (" + positionX + ", " + positionY + ")");
    }
}

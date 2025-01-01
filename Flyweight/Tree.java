package Flyweight;

class Tree {
    private int positionX;
    private int positionY;
    private TreeType treeType;
    public Tree(int positionX, int positionY, TreeType treeType){
        this.positionX = positionX;
        this.positionY = positionY;
        this.treeType = treeType;
    }

    public void draw() {
        treeType.draw(positionX, positionY);
    }

}

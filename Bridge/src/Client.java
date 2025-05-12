
public class Client {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5);
        Shape square = new Square(rasterRenderer, 10);

        circle.draw(); // Drawing a circle of radius 5 using Vector rendering.
        square.draw(); // Drawing a square of side 10 using Raster rendering.
    }
}


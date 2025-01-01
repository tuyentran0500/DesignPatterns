public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels for a circle of radius " + radius + " with raster renderer");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing pixels for a square of side " + side + " with raster renderer");
    }
}

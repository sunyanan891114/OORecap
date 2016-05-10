public class Rectangle implements Shape {

    final private int height;
    final private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double areaCalculate() {
        return height * width;
    }

    public double perimeterCalculate() {
        return 2 * (height + width);
    }
}

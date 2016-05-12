public class Circle implements Shape{


    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double areaCalculate() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double perimeterCalculate() {
        return 2 * Math.PI * radius;
    }
}

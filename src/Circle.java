/**
 * Created by sceli on 5/10/16.
 */
public class Circle {


    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double areaCalculate() {
        return Math.PI * (radius * radius);
    }

    public double perimeterCalculate() {
        return 2 * Math.PI * radius;
    }
}

public class Square implements Shape{
    private final int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public double areaCalculate() {
       return size * size;
    }

    @Override
    public double perimeterCalculate() {
        return 4 * size;
    }
}

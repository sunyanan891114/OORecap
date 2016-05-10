public class Square {
    private final int size;

    public Square(int size) {
        this.size = size;
    }

    public double areaCalculate() {
       return size * size;
    }


    public double perimeterCalculate() {
        return 4 * size;
    }
}

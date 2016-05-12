import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CircleTest {

    private Circle circle;

    @Before
    public void initialize() {
        circle = new Circle(4);
    }

    @Test
    public void testCorrectArea() {
        Circle circle2 = new Circle(5);
        assertEquals(78.53981633974483, circle2.areaCalculate());
    }

    @Test
    public void testPerimeterCalculate() {
        assertEquals(25.132741228718345, circle.perimeterCalculate());
    }
}
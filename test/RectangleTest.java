import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void initialize() {
        rectangle = new Rectangle(4, 2);
    }

    @Test
    public void testAreaCalculate() {
        assertEquals(8.0, rectangle.areaCalculate());
    }

    @Test
    public void testCorrectArea() {
        Rectangle rectangle2 = new Rectangle(2, 3);
        assertEquals(6.0, rectangle2.areaCalculate());
    }

    @Test
    public void testPerimeterCalculate() {
        assertEquals(12.0, rectangle.perimeterCalculate());
    }

    @Test
    public void testCorrectPerimeter() {
        Rectangle rectangle3 = new Rectangle(2,5);
        assertEquals(14.0, rectangle3.perimeterCalculate());
    }
}

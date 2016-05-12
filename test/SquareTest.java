import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SquareTest {

    private Square square;

    @Before
    public void initialize() {
        square = new Square(4);
    }

    @Test
    public void testAreaCalculate() {
        assertEquals(16.0, square.areaCalculate());
    }

    @Test
    public void testPerimeterCalculate() {
        assertEquals(16.0, square.perimeterCalculate());
    }
}


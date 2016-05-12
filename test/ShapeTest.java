import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShapeTest {
  private Shape rectangle;
  private Shape square;
  private Shape circle;

  @Before
  public void initialize() {
    rectangle = new Rectangle(2, 4);
    square = new Square(4);
    circle = new Circle(4);
  }

  @Test
  public void testAreaCalculate() {
    assertEquals(50.26548245743669, circle.areaCalculate());
    assertEquals(8.0, rectangle.areaCalculate());
    assertEquals(16.0, square.areaCalculate());
  }

  @Test
  public void testPerimeterCalculate() {
    assertEquals(25.132741228718345, circle.perimeterCalculate());
    assertEquals(16.0, square.perimeterCalculate());
    assertEquals(12.0, rectangle.perimeterCalculate());
  }
}

package shapes;

import org.junit.Test;
import static org.junit.Assert.*;

import static shapes.Fixtures.*;

public class TestSize {

  private final Size v = new Size();

  @Test
  public void testCircle() {
    final int s = simpleCircle.accept(v);
    assertEquals(1, s);
  }

  @Test
  public void testRectangle() {
    final int s = simpleRectangle.accept(v);
    assertEquals(1, s);
  }

  @Test
  public void testLocation() {
    final int s = simpleLocation.accept(v);
    assertEquals(1, s);
  }

  @Test
  public void testFilled() {
    final int s = simpleFilled.accept(v);
    assertEquals(1, s);
  }

  @Test
  public void testStroke() {
    final int s = simpleStroke.accept(v);
    assertEquals(1, s);
  }

  @Test
  public void testGroupSimple() {
    final int r = simpleGroup.accept(v);
    assertEquals(2, r);
  }

  @Test
  public void testGroupComplex() {
    final int r = complexGroup.accept(v);
    assertEquals(6, r);
  }

  @Test
  public void testOutline() {
    final int s = simpleOutline.accept(v);
    assertEquals(1, s);
  }

  @Test
  public void testPolygon() {
    final int r = simplePolygon.accept(v);
    assertEquals(1, r);
  }
}

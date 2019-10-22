package shapes;

import org.junit.Test;
import static org.junit.Assert.*;

import static shapes.Fixtures.*;

public class TestBoundingBox {

  private final BoundingBox v = new BoundingBox();

  @Test
  public void testCircle() {
    final Location b = simpleCircle.accept(v);
    final Rectangle r = (Rectangle) b.getShape();
    assertEquals(-50, b.getX());
    assertEquals(-50, b.getY());
    assertEquals(100, r.getWidth());
    assertEquals(100, r.getHeight());
  }

  @Test
  public void testRectangle() {
    final Location b = simpleRectangle.accept(v);
    final Rectangle r = (Rectangle) b.getShape();
    assertEquals(0, b.getX());
    assertEquals(0, b.getY());
    assertEquals(80, r.getWidth());
    assertEquals(120, r.getHeight());
  }

  @Test
  public void testLocation() {
    final Location b = simpleLocation.accept(v);
    final Rectangle r = (Rectangle) b.getShape();
    assertEquals(70, b.getX());
    assertEquals(30, b.getY());
    assertEquals(80, r.getWidth());
    assertEquals(120, r.getHeight());
  }

  @Test
  public void testFilled() {
    final Location b = simpleFilled.accept(v);
    final Rectangle r = (Rectangle) b.getShape();
    assertEquals(0, b.getX());
    assertEquals(0, b.getY());
    assertEquals(80, r.getWidth());
    assertEquals(120, r.getHeight());
  }

  @Test
  public void testStroke() {
    final Location b = simpleStroke.accept(v);
    final Rectangle r = (Rectangle) b.getShape();
    assertEquals(0, b.getX());
    assertEquals(0, b.getY());
    assertEquals(80, r.getWidth());
    assertEquals(120, r.getHeight());
  }

  @Test
  public void testGroupSimple() {
    final Location b = simpleGroup.accept(v);
    final Rectangle r = (Rectangle) b.getShape();
    assertEquals(150, b.getX());
    assertEquals(50, b.getY());
    assertEquals(350, r.getWidth());
    assertEquals(300, r.getHeight());
  }

  @Test
  public void testGroupComplex() {
    final Location b = complexGroup.accept(v);
    final Rectangle r = (Rectangle) b.getShape();
    assertEquals(30, b.getX());
    assertEquals(80, b.getY());
    assertEquals(470, r.getWidth());
    assertEquals(320, r.getHeight());
  }
}

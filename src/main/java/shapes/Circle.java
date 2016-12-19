package shapes;

/** A circle with a specified radius. */
public class Circle implements Shape {

  protected final int radius;

  public Circle(int radius) {
    assert radius >= 0;
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  public <Result> Result accept(ShapeVisitor<Result> v) {
    return v.visitCircle(this);
  }
}

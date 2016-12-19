package shapes;

/**
 * A decorator indicating that a shape should be drawn as a filled shape instead of an outlined one.
 */
public class Filled implements Shape {

  protected final Shape shape;

  public Filled(Shape shape) {
    this.shape = shape;
  }

  public Shape getShape() {
    return shape;
  }

  public <Result> Result accept(ShapeVisitor<Result> v) {
    return v.visitFilled(this);
  }
}

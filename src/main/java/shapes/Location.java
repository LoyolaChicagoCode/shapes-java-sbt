package shapes;

/** A decorator for specifying a shape's location. */
public class Location implements Shape {

  protected final int x, y;

  protected final Shape shape;

  public Location(int x, int y, Shape shape) {
    this.x = x;
    this.y = y;
    this.shape = shape;
  }

  public Shape getShape() {
    return shape;
  }

  int getX() {
    return x;
  }

  int getY() {
    return y;
  }

  public <Result> Result accept(ShapeVisitor<Result> v) {
    return v.visitLocation(this);
  }
}

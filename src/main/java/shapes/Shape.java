package shapes;

/** A graphical shape. */
public interface Shape {
  <Result> Result accept(ShapeVisitor<Result> v);
}

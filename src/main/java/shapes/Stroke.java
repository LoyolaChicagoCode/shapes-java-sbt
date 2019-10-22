package shapes;

import java.awt.Color;

/** A decorator for specifying the stroke (foreground) color for drawing the shape. */
public class Stroke implements Shape {

  // TODO entirely your job

  public Stroke(final Color color, final Shape shape) {}

  public Color getColor() {
    return null;
  }

  public Shape getShape() {
    return null;
  }

  public <Result> Result accept(final ShapeVisitor<Result> v) {
    return null;
  }
}

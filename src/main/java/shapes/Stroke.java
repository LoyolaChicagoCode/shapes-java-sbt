package shapes;

import java.awt.Color;

/** A decorator for specifying the stroke (foreground) color for drawing the shape. */
public class Stroke implements Shape {

  // TODO entirely your job

  public Stroke(Color color, Shape shape) {}

  public Color getColor() {
    return null;
  }

  public Shape getShape() {
    return null;
  }

  public <Result> Result accept(ShapeVisitor<Result> v) {
    return null;
  }
}

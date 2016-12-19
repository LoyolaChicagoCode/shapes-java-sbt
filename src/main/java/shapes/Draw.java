package shapes;

import java.awt.Graphics;

/** A visitor for drawing a shape to a Java AWT graphics object. */
public class Draw implements ShapeVisitor<Void> {

  // TODO entirely your job (except visitCircle)

  protected final Graphics g;

  public Draw(Graphics g) {
    this.g = g;
  }

  public Void visitCircle(Circle c) {
    int r = c.getRadius();
    g.drawArc(-r, -r, 2 * r, 2 * r, 0, 360);
    return null;
  }

  public Void visitStroke(Stroke c) {
    return null;
  }

  public Void visitFilled(Filled f) {
    return null;
  }

  public Void visitGroup(Group g) {
    for (Shape s : g.getShapes()) {
      s.accept(this);
    }
    return null;
  }

  public Void visitLocation(Location l) {
    return null;
  }

  public Void visitRectangle(Rectangle r) {
    return null;
  }
}

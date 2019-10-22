package shapes;

import java.awt.Graphics;

/** A visitor for drawing filled shapes to a Java AWT graphics object. */
public class Fill extends Draw {

  public Fill(final Graphics g) {
    super(g);
  }

  public Void visitCircle(final Circle c) {
    int r = c.getRadius();
    g.fillArc(-r, -r, 2 * r, 2 * r, 0, 360);
    return null;
  }

  public Void visitRectangle(final Rectangle r) {
    // TODO your job
    return null;
  }
}

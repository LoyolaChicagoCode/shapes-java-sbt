package shapes;

import java.awt.Graphics;

/** A fill visitor extended to handle outline and polygon shapes. */
public class ExtendedFill extends Fill implements ExtendedShapeVisitor<Void> {

  // TODO entirely your job

  public ExtendedFill(final Graphics g) {
    super(g);
  }

  public Void visitOutline(final Outline o) {
    return null;
  }

  public Void visitPolygon(final Polygon s) {
    return null;
  }
}

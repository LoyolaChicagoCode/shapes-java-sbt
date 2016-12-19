package shapes;

import java.awt.Graphics;

/** A fill visitor extended to handle outline and polygon shapes. */
public class ExtendedFill extends Fill implements ExtendedShapeVisitor<Void> {

  // TODO entirely your job

  public ExtendedFill(Graphics g) {
    super(g);
  }

  public Void visitOutline(Outline o) {
    return null;
  }

  public Void visitPolygon(Polygon s) {
    return null;
  }
}

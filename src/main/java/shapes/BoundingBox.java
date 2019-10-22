package shapes;

/**
 * A shape visitor for calculating the bounding box, that is, the smallest rectangle containing the
 * shape. The resulting bounding box is returned as a rectangle at a specific location.
 */
public class BoundingBox implements ShapeVisitor<Location> {

  // TODO entirely your job (except visitCircle)

  public Location visitCircle(final Circle c) {
    int radius = c.getRadius();
    return new Location(-radius, -radius, new Rectangle(2 * radius, 2 * radius));
  }

  public Location visitFilled(final Filled f) {
    return null;
  }

  public Location visitGroup(final Group g) {
    return null;
  }

  public Location visitLocation(final Location l) {
    return null;
  }

  public Location visitRectangle(final Rectangle r) {
    return null;
  }

  public Location visitStroke(final Stroke c) {
    return null;
  }
}

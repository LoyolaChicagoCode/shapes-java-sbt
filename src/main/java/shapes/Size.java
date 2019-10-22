package shapes;

/** A visitor to compute the number of basic shapes in a (possibly complex) shape. */
public class Size implements ExtendedShapeVisitor<Integer> {

  // TODO entirely your job

  public Integer visitPolygon(final Polygon p) {
    return -1;
  }

  public Integer visitCircle(final Circle c) {
    return -1;
  }

  public Integer visitGroup(final Group g) {
    return -1;
  }

  public Integer visitRectangle(final Rectangle q) {
    return -1;
  }

  public Integer visitOutline(final Outline o) {
    return -1;
  }

  public Integer visitFilled(final Filled c) {
    return -1;
  }

  public Integer visitLocation(final Location l) {
    return -1;
  }

  public Integer visitStroke(final Stroke c) {
    return -1;
  }
}

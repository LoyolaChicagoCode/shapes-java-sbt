package shapes;

/** A visitor to compute the number of basic shapes in a (possibly complex) shape. */
public class Size implements ExtendedShapeVisitor<Integer> {

  // TODO entirely your job

  public Integer visitPolygon(Polygon p) {
    return -1;
  }

  public Integer visitCircle(Circle c) {
    return -1;
  }

  public Integer visitGroup(Group g) {
    return -1;
  }

  public Integer visitRectangle(Rectangle q) {
    return -1;
  }

  public Integer visitOutline(Outline o) {
    return -1;
  }

  public Integer visitFilled(Filled c) {
    return -1;
  }

  public Integer visitLocation(Location l) {
    return -1;
  }

  public Integer visitStroke(Stroke c) {
    return -1;
  }
}

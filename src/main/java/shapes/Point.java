package shapes;

/** A point, implemented as a location without a shape. */
public class Point extends Location {

  // TODO your job
  // HINT: use a circle with radius 0 as the shape!

  public Point(int x, int y) {
    super(x, y, null);
    assert x >= 0;
    assert y >= 0;
  }
}

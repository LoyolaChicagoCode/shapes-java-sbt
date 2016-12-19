package shapes;

import java.util.List;

/** A special case of a group consisting only of Points. */
public class Polygon extends Group {

  public Polygon(Point... points) {
    super(points);
  }

  @SuppressWarnings("unchecked")
  public List<? extends Point> getPoints() {
    return (List<? extends Point>) getShapes();
  }

  public <Result> Result accept(ShapeVisitor<Result> v) {
    // TODO your job
    return null;
  }
}

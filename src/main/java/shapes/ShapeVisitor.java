package shapes;

/** A visitor on shapes. */
public interface ShapeVisitor<Result> {
  Result visitCircle(Circle c);

  Result visitRectangle(Rectangle r);

  Result visitGroup(Group g);

  Result visitStroke(Stroke c);

  Result visitFilled(Filled c);

  Result visitLocation(Location l);
}

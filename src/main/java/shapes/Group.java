package shapes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** A composite for grouping shapes. */
public class Group implements Shape {

  protected final List<? extends Shape> shapes;

  public Group(final Shape... shapes) {
    this.shapes = Arrays.asList(shapes);
  }

  public List<? extends Shape> getShapes() {
    return Collections.unmodifiableList(shapes);
  }

  public <Result> Result accept(final ShapeVisitor<Result> v) {
    return v.visitGroup(this);
  }
}

package shapes;

/** A rectangle with specified width and height. */
public class Rectangle implements Shape {

  protected final int width, height;

  public Rectangle(final int width, final int height) {
    assert width >= 0;
    assert height >= 0;
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public <Result> Result accept(final ShapeVisitor<Result> v) {
    return v.visitRectangle(this);
  }
}

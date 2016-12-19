package shapes;


/**
 * A decorator indicating that a shape
 * should be drawn as an outlined shape
 * instead of a filled one.
 */
public class Outline implements Shape {

	protected final Shape shape;
	
	public Outline(Shape shape) {
		this.shape = shape;
	}
	
	public Shape getShape() {
		return shape;
	}
	
	public <Result> Result accept(ShapeVisitor<Result> v) {
		// TODO your job
		return null;
	}
}

package shapes;


/**
 * An extended shape visitor that handles outline
 * and polygon shapes.
 */
public interface ExtendedShapeVisitor<Result> extends ShapeVisitor<Result> {
	Result visitOutline(Outline o);
	Result visitPolygon(Polygon p);
}

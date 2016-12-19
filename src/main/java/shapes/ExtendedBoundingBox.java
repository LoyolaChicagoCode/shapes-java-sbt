package shapes;


/**
 * An bounding box visitor extended to handle outline
 * and polygon shapes.
 */
public class ExtendedBoundingBox extends BoundingBox implements ExtendedShapeVisitor<Location> {
	
	// TODO entirely your job
	
	public Location visitOutline(Outline o) {
		return null;
	}

	public Location visitPolygon(Polygon s) {
		return null;
	}
}

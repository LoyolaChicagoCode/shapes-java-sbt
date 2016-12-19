package shapes;

import java.awt.Graphics;


/**
 * A draw visitor extended to handle outline
 * and polygon shapes.
 */
public class ExtendedDraw extends Draw implements ExtendedShapeVisitor<Void> {
	
	// TODO entirely your job
	
	public ExtendedDraw(Graphics g) {
		super(g);
	}

	public Void visitOutline(Outline o) {
		return null;
	}

	public Void visitPolygon(Polygon s) {
		return null;
	}
}

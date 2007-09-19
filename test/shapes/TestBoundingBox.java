package shapes;

import java.awt.Color;

import junit.framework.TestCase;

public class TestBoundingBox extends TestCase {

	protected BoundingBox v;
	
	protected void setUp() throws Exception {
		super.setUp();
		v = new BoundingBox();
	}

	protected void tearDown() throws Exception {
		v = null;
		super.tearDown();
	}

	public void testCircle() {
		Location b = new Circle(50).accept(v);
		Rectangle r = (Rectangle) b.getShape();
		assertEquals(-50, b.getX());
		assertEquals(-50, b.getY());
		assertEquals(100, r.getWidth());
		assertEquals(100, r.getHeight());
	}

	public void testRectangle() {
		Location b = new Rectangle(80, 120).accept(v);
		Rectangle r = (Rectangle) b.getShape();
		assertEquals(0, b.getX());
		assertEquals(0, b.getY());
		assertEquals(80, r.getWidth());
		assertEquals(120, r.getHeight());
	}
	
	public void testLocation() {
		Location b = new Location(70, 30, new Rectangle(80, 120)).accept(v);
		Rectangle r = (Rectangle) b.getShape();
		assertEquals(70, b.getX());
		assertEquals(30, b.getY());
		assertEquals(80, r.getWidth());
		assertEquals(120, r.getHeight());
	}
	
	public void testFilled() {
		Location b = new Filled(new Rectangle(80, 120)).accept(v);
		Rectangle r = (Rectangle) b.getShape();
		assertEquals(0, b.getX());
		assertEquals(0, b.getY());
		assertEquals(80, r.getWidth());
		assertEquals(120, r.getHeight());
	}
	
	public void testStroke() {
		Location b = new Stroke(Color.RED, new Rectangle(80, 120)).accept(v);
		Rectangle r = (Rectangle) b.getShape();
		assertEquals(0, b.getX());
		assertEquals(0, b.getY());
		assertEquals(80, r.getWidth());
		assertEquals(120, r.getHeight());
	}
	
	public void testGroupSimple() {
		Shape s = new Group(
			new Location(200, 100, new Circle(50)),
			new Location(400, 300, new Rectangle(100, 50))
		);
		Location b = s.accept(v);
		Rectangle r = (Rectangle) b.getShape();
		assertEquals(150, b.getX());
		assertEquals(50, b.getY());
		assertEquals(350, r.getWidth());
		assertEquals(300, r.getHeight());
	}
	
	public void testGroupComplex() {
  	Shape s = new Location(50, 100, 
  		new Filled(
  			new Group(
				  new Circle(20),
				  new Location(150, 50,
					  new Stroke(Color.RED,
						  new Group(
							  new Rectangle(50, 30),
							  new Rectangle(300, 60),
							  new Location(100, 200, 
								  new Stroke(Color.ORANGE,
									  new Filled(
									  	new Circle(50)
									  )
								  )
							  )
						  )
					  )
				  ),
				  new Rectangle(100, 200)
				)
  		)
		);
		Location b = s.accept(v);
		Rectangle r = (Rectangle) b.getShape();
		assertEquals(30, b.getX());
		assertEquals(80, b.getY());
		assertEquals(470, r.getWidth());
		assertEquals(320, r.getHeight());
	}
}

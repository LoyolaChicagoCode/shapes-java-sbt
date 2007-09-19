package shapes;

import java.awt.Color;

import junit.framework.TestCase;

public class TestSize extends TestCase {

	protected Size v;
	
	protected void setUp() throws Exception {
		super.setUp();
		v = new Size();
	}

	protected void tearDown() throws Exception {
		v = null;
		super.tearDown();
	}

	public void testCircle() {
		int s = new Circle(50).accept(v);
		assertEquals(1, s);
	}

	public void testRectangle() {
		int s = new Rectangle(80, 120).accept(v);
		assertEquals(1, s);
	}
	
	public void testLocation() {
		int s = new Location(70, 30, new Rectangle(80, 120)).accept(v);
		assertEquals(1, s);
	}
	
	public void testFilled() {
		int s = new Filled(new Rectangle(80, 120)).accept(v);
		assertEquals(1, s);
	}
	
	public void testStroke() {
		int s = new Stroke(Color.RED, new Rectangle(80, 120)).accept(v);
		assertEquals(1, s);
	}
	
	public void testGroupSimple() {
		Shape s = new Group(
			new Location(200, 100, new Circle(50)),
			new Location(400, 300, new Rectangle(100, 50))
		);
		int r = s.accept(v);
		assertEquals(2, r);
	}
	
	public void testGroupComplex() {
		final Shape s = new Location(50, 100, 
			new Group(
				new Circle(20),
				new Rectangle(100, 200),
				new Location(150, 50,
					new Stroke(Color.RED,
						new Filled(
							new Group(
								new Rectangle(50, 30),
								new Outline(new Rectangle(300, 60)),
				  			new Stroke(Color.CYAN,
				  				new Polygon(
					  		  	new Point(50, 50),
					  		  	new Point(60, 100),
					  		  	new Point(100, 110),
					  		  	new Point(120, 60)
					  		  )
				  			),
								new Location(100, 200, 
									new Stroke(Color.ORANGE,
										new Outline(new Circle(50))
									)
								)
							)
						)
					)
				)
			)
		);
		int r = s.accept(v);
		assertEquals(6, r);
	}
	
	public void testOutline() {
		int s = new Outline(new Rectangle(80, 120)).accept(v);
		assertEquals(1, s);
	}
	
	public void testPolygon() {
		Shape s = new Polygon(
	  	new Point(50, 50),
	  	new Point(60, 100),
	  	new Point(100, 110),
	  	new Point(120, 60)
	  );
		int r = s.accept(v);
		assertEquals(1, r);
	}
}

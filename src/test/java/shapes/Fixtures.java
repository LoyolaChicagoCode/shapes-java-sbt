package shapes;

import java.awt.Color;

public final class Fixtures {

  private Fixtures() {}

  public static final Shape simpleCircle = new Circle(50);

  public static final Shape simpleRectangle = new Rectangle(80, 120);

  public static final Shape simpleLocation = new Location(70, 30, new Rectangle(80, 120));

  public static final Shape simpleLocation2 = new Location(50, 100, new Circle(20));

  public static final Shape simpleLocation3 =
      new Location(50, 100, new Filled(new Outline(new Circle(20))));

  public static final Shape simpleFilled = new Filled(new Rectangle(80, 120));

  public static final Shape simpleStroke = new Stroke(Color.RED, new Rectangle(80, 120));

  public static final Shape simpleGroup =
      new Group(
          new Location(200, 100, new Circle(50)), new Location(400, 300, new Rectangle(100, 50)));

  public static final Shape complexGroup =
      new Location(
          50,
          100,
          new Group(
              new Circle(20),
              new Rectangle(100, 200),
              new Location(
                  150,
                  50,
                  new Stroke(
                      Color.RED,
                      new Filled(
                          new Group(
                              new Rectangle(50, 30),
                              new Outline(new Rectangle(300, 60)),
                              new Stroke(
                                  Color.CYAN,
                                  new Polygon(
                                      new Point(50, 50),
                                      new Point(60, 100),
                                      new Point(100, 110),
                                      new Point(120, 60))),
                              new Location(
                                  100,
                                  200,
                                  new Stroke(Color.ORANGE, new Outline(new Circle(50))))))))));

  public static final Shape complexGroup2 =
      new Location(
          50,
          100,
          new Group(
              new Circle(20),
              new Rectangle(100, 200),
              new Location(
                  150,
                  50,
                  new Stroke(
                      Color.RED,
                      new Group(
                          new Filled(new Rectangle(50, 30)),
                          new Rectangle(300, 60),
                          new Location(
                              100, 200, new Stroke(Color.ORANGE, new Filled(new Circle(50)))))))));

  public static final Shape simpleOutline = new Outline(new Rectangle(80, 120));

  public static final Shape simplePolygon =
      new Polygon(new Point(50, 50), new Point(60, 100), new Point(100, 110), new Point(120, 60));
}

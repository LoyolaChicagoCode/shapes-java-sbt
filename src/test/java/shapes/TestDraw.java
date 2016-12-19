package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import junit.framework.TestCase;

public class TestDraw extends TestCase {

  public static void assertEquals(BufferedImage i1, BufferedImage i2) {
    Raster u = i1.getData();
    Raster v = i2.getData();
    for (int l = 0; l < 500; l++) {
      for (int k = 0; k < 500; k++) {
        int[] pu = u.getPixel(k, l, (int[]) null);
        int[] pv = v.getPixel(k, l, (int[]) null);
        assertEquals(pu.length, pv.length);
        for (int m = 0; m < pu.length; m++) {
          assertEquals(pu[m], pv[m]);
        }
      }
    }
  }

  public void testSimple() {
    final Shape s = new Location(50, 100, new Circle(20));
    final BufferedImage i = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
    s.accept(new Draw(i.getGraphics()));
    final BufferedImage j = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
    Graphics g = j.getGraphics();
    g.translate(50, 100);
    g.drawArc(-20, -20, 40, 40, 0, 360);
    assertEquals(i, j);
  }

  public void testGroupComplex() {
    final Shape s =
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
                                100,
                                200,
                                new Stroke(Color.ORANGE, new Filled(new Circle(50)))))))));
    final BufferedImage i = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
    s.accept(new Draw(i.getGraphics()));
    final BufferedImage j = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
    Graphics g = j.getGraphics();
    g.translate(50, 100);
    g.drawArc(-20, -20, 40, 40, 0, 360);
    g.drawRect(0, 0, 100, 200);
    g.setColor(Color.RED);
    g.fillRect(150, 50, 50, 30);
    g.drawRect(150, 50, 300, 60);
    g.setColor(Color.ORANGE);
    g.translate(250, 250);
    g.fillArc(-50, -50, 100, 100, 0, 360);
    assertEquals(i, j);
  }
}

package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import org.junit.Test;

import static shapes.Fixtures.*;

public class TestExtendedDraw {

  @Test
  public void testSimple() {
    final Shape s = simpleLocation3;
    final BufferedImage i = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
    s.accept(new ExtendedDraw(i.getGraphics()));
    final BufferedImage j = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
    final Graphics g = j.getGraphics();
    g.translate(50, 100);
    g.drawArc(-20, -20, 40, 40, 0, 360);
    TestDraw.assertEquals(i, j);
  }

  @Test
  public void testGroupComplex() {
    final Shape s = complexGroup;
    final BufferedImage i = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
    s.accept(new ExtendedDraw(i.getGraphics()));
    final BufferedImage j = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
    final Graphics g = j.getGraphics();
    g.translate(50, 100);
    g.drawArc(-20, -20, 40, 40, 0, 360);
    g.drawRect(0, 0, 100, 200);
    g.setColor(Color.RED);
    g.fillRect(150, 50, 50, 30);
    g.drawRect(150, 50, 300, 60);
    g.setColor(Color.CYAN);
    g.fillPolygon(new int[] {200, 210, 250, 270}, new int[] {100, 150, 160, 110}, 4);
    g.setColor(Color.ORANGE);
    g.translate(250, 250);
    g.drawArc(-50, -50, 100, 100, 0, 360);
    TestDraw.assertEquals(i, j);
  }
}

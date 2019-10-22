package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;

import org.junit.Test;

import static shapes.Fixtures.*;

public class TestDraw {

  public static void assertEquals(final BufferedImage i1, final BufferedImage i2) {
    final Raster u = i1.getData();
    final Raster v = i2.getData();
    for (int l = 0; l < 500; l++) {
      for (int k = 0; k < 500; k++) {
        int[] pu = u.getPixel(k, l, (int[]) null);
        int[] pv = v.getPixel(k, l, (int[]) null);
        org.junit.Assert.assertEquals(pu.length, pv.length);
        for (int m = 0; m < pu.length; m++) {
          org.junit.Assert.assertEquals(pu[m], pv[m]);
        }
      }
    }
  }

  @Test
  public void testSimple() {
    final Shape s = simpleLocation2;
    final BufferedImage i = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
    s.accept(new Draw(i.getGraphics()));
    final BufferedImage j = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
    final Graphics g = j.getGraphics();
    g.translate(50, 100);
    g.drawArc(-20, -20, 40, 40, 0, 360);
    assertEquals(i, j);
  }

  @Test
  public void testGroupComplex() {
    final Shape s = complexGroup2;
    final BufferedImage i = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
    s.accept(new Draw(i.getGraphics()));
    final BufferedImage j = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
    final Graphics g = j.getGraphics();
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

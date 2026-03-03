import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/*
<applet code="ShapeApplet.class" width="500" height="500"></applet>
*/

public class program13 extends Applet {
  public void paint(Graphics g) {
    // Set a color
    g.setColor(Color.blue);

    // Draw a line
    g.drawLine(50, 50, 200, 50);

    // Draw a rectangle
    g.drawRect(50, 80, 150, 80);

    // Draw a filled rectangle
    g.setColor(Color.red);
    g.fillRect(250, 80, 150, 80);

    // Draw an oval
    g.setColor(Color.green);
    g.drawOval(50, 200, 150, 80);

    // Draw a filled oval
    g.setColor(Color.orange);
    g.fillOval(250, 200, 150, 80);

    // Draw a polygon (triangle)
    int x[] = { 150, 200, 100 };
    int y[] = { 330, 400, 400 };
    g.setColor(Color.magenta);
    g.drawPolygon(x, y, 3);
    // Filled polygon
    int x2[] = { 300, 350, 250 };
    int y2[] = { 330, 400, 400 };
    g.setColor(Color.darkGray);
    g.fillPolygon(x2, y2, 3);
  }
}

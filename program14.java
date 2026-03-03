import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="MouseShapes.class" width="600" height="500"></applet>
*/
public class program14 extends Applet implements MouseListener {
  int x = 0, y = 0; // Mouse click coordinates

  public void init() {
    addMouseListener(this); // Register Mouse Listener
  }

  public void paint(Graphics g) {
    if (x == 0 && y == 0)
      return; // Nothing drawn until first click
    g.setColor(Color.blue);
    g.drawOval(x - 25, y - 25, 50, 50); // Circle
    g.setColor(Color.red);
    g.drawRect(x - 25, y + 40, 50, 50); // Square
    g.setColor(Color.green);
    g.drawOval(x + 60, y - 25, 80, 50); // Ellipse
    g.setColor(Color.magenta);
    g.drawRect(x + 60, y + 40, 80, 50); // Rectangle
  }

  // MouseListener methods
  public void mouseClicked(MouseEvent e) {
    x = e.getX();
    y = e.getY();
    repaint();
  }

  public void mousePressed(MouseEvent e) {
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }
}

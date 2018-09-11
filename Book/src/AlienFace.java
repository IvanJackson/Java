import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Rectangle2D;

public class AlienFace extends JComponent{

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		//Let's make the face out of a rectangle
		Rectangle2D.Double face = new Rectangle2D.Double(20, 10, 100, 200);
//		g2.setColor(getBackground());
//		g2.fill(face);
		g2.draw(face);
		//Let's make the eyes out of ellipses
		Ellipse2D.Double eye1 = new Ellipse2D.Double(40, 60, 20, 20);
		Ellipse2D.Double eye2 = new Ellipse2D.Double(80, 60, 20, 20);
		g2.setColor(Color.BLUE);
//		g2.fill(Color.CYAN);
		g2.draw(eye1);
		g2.draw(eye2);
		Line2D.Double mouth = new Line2D.Double(40, 140, 100, 140);
		g2.setColor(Color.black);
		g2.draw(mouth);
		g2.drawString("Hello,Iván", 20, 250);
		
	}
}

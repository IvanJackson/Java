import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class EllipseComponent extends JComponent {
	public void paintComponent (Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
//		Ellipse2D.Double ellipse = new Ellipse2D.Double(0,0, 200, 200);
//		g2.draw(ellipse);
		
		Ellipse2D.Double circleWithRadius25 = new Ellipse2D.Double(125,125,25,25);
		g2.draw(circleWithRadius25);
	}
}

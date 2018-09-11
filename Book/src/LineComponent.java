import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class LineComponent extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Line2D.Double line = new Line2D.Double(0, 3, 20, 70);
		g2.draw(line);
	}
	
}

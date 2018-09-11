import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class LineComponent extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
//		Line2D.Double line = new Line2D.Double(0, 3, 20, 70);
//		g2.drawString("Hello World!", 20, 30);
		// We could also give color to the borders or fill the shape with the
	// following functions
//		g2.setColor(Color.cyan);
//		g2.draw(line);
//		
		//g2.fill(Color.green);
		//The line above would fill the shape of color green
		Line2D.Double firstLine = new Line2D.Double(10, 10, 60, 200);
		g2.setColor(Color.blue);
		g2.draw(firstLine);
		Line2D.Double secondLine = new Line2D.Double(110, 10, 60, 200);
		g2.setColor(Color.red);
		g2.draw(secondLine);
		g2.drawString("V", 50, 250);
	}
	
}

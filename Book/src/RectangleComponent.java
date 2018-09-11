import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
/**
A component that draws two rectangles.
*/
public class RectangleComponent extends JComponent {
	public void paintComponent(Graphics g) {
	// Recover Graphics2D
	Graphics2D g2 = (Graphics2D) g;
	// Construct a Rectangle and then draw it
//	Rectangle box = new Rectangle(5,10,20,20);
//	g2.draw(box);
	// Move rectangle 15 units to the right and 25 units down
//	box.translate(15, 25);
	// Draw moved rectangle
//	g2.draw(box);
	
	/*
	 * Here we created a Rectangle object called "square"
	 * gave it the coordinates (20,20) and a 20 height and width
	 * the outline is blue and the fill is yellow
	 */
	Rectangle square = new Rectangle(20, 20,20, 20);
	g2.setColor(Color.yellow);
	g2.fill(square);
	g2.setColor(Color.blue);
	g2.draw(square);
	}
}
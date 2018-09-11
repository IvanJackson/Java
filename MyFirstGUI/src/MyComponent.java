import java.awt.Graphics;

import javax.swing.JComponent;

public class MyComponent extends JComponent {

	public void paintComponent(Graphics g) {
		
//		Graphics2D g2 = (Graphics2D) g;
//		g2.drawString("Hello World!",10, 10);
		
		
		Car theCar = new Car(0,0);
		Car theCar2 = new Car(100,100);
		theCar.draw(g);
		theCar2.draw(g);
	}
}

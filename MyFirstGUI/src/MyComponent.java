import java.awt.Graphics;

import javax.swing.JComponent;

public class MyComponent extends JComponent {
public static int counter = 0;
	public void paintComponent(Graphics g) {
		/*
		 * Cada vez que la pantalla se mueva, el paintComponent se llama
		 * otra vez, y se vuelve a pintar
		 */
//		Graphics2D g2 = (Graphics2D) g;
//		g2.drawString("Hello World!",10, 10);
		
		
		Car theCar = new Car(0,0);
		Car theCar2 = new Car(100,100);
		/*
		 * tenemos que calcular el tamano de la pantalla para saber donde 
		 * colocar el carro, ya que lo queremos en el lower right corner
		 */
		Car theCar3 = new Car(100,100);
		int xLowerRight = this.getWidth()-theCar3.getWidth();
		int yLowerRight = this.getHeight() -theCar3.getHeight();
		theCar3.setxPosition(xLowerRight);
		theCar3.setyPosition(yLowerRight);
		theCar.draw(g);
		theCar2.draw(g);
		theCar3.draw(g);
		counter= counter +1;
		System.out.println("counter = " + counter);
		
	}
}

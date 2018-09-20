import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class CarStage extends JComponent {
public static int counter = 0;
private Car theCar5 = new Car(0,0, 10);
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
		
		Car theCar4 = new Car(0,0);
		Random genRand = new Random();
		// el parametro de nextInt es el valor maximo
		int randomX = genRand.nextInt(this.getWidth() - theCar4.getWidth());
		int randomY =genRand.nextInt(this.getHeight() - theCar4.getHeight());
		theCar4.setxPosition(randomX);
		theCar4.setyPosition(randomY);
		
		//What if we want the car to repaint itself without having
		// to call the method again
		
		theCar.draw(g);
		theCar2.draw(g);
		theCar3.draw(g);
		theCar4.draw(g);
		
		
		//this counts the amount of time that the paintComponent method
		//Is called
		counter= counter +1;
		System.out.println("counter = " + counter);
		
		
		
		
		/*We are going to make the car move in a single line
		 * 
		 * We are moving the car outside of the paintComponent because we want to move the car that aready exists, not create a new one every single time it repaints it
		 */
		if(theCar5.getDirection()>=0) {
			//Car is going left to right
			if(theCar5.getxPosition()+theCar5.getWidth()<this.getWidth()) {
				// car has not reached border
				theCar5.setxPosition(theCar5.getxPosition()+theCar5.getSpeed());
			}
			else {
				//car has reached border
				theCar5.setDirection(-1);
			}
		}
		else {
			//Car is going right to left
			if(theCar5.getxPosition()>0) {
				// car has not reached border
				theCar5.setxPosition(theCar5.getxPosition()+theCar5.getSpeed()*theCar5.getDirection());
			}
			else {
				//car has reached the border
				theCar5.setDirection(1);
			}
		}
	
		//theCar5.setxPosition(theCar5.getxPosition()+theCar5.getSpeed());
		theCar5.draw(g);
	}
}

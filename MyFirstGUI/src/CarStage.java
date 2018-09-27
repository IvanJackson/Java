import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class CarStage extends JComponent {

	public static int counter = 0;
	
	Car[] theCars;// el valor inicial de un array cuando se crea es null, es lo mismo que declararlo, pero es automatico
	private int numCars = 0;
	
	private static int INITIAL_NUMS_CARS = 5;
	
	private Random generator;
	CarStage() {
		generator = new Random();
	}
	
	public void addCar(Car c) {
		if(theCars==null) {
			theCars = new Car[INITIAL_NUMS_CARS];
			theCars[0]=c;
			
		}
		else if(numCars < theCars.length) {
			//There is room in the array
			theCars[numCars] = c;

		}
		else {
			Car[] newArray =new Car[theCars.length*2];
			for (int i =0;i<theCars.length;i++) {
				newArray[i]=theCars[i];
			}
			newArray[theCars.length] = c;
			theCars = newArray;
		}
		numCars++;
		
	}
	public void paintComponent(Graphics g) {

		for(int i=0;i<numCars;i++) {
			theCars[i].draw(g);
			if (carReachedEdge(theCars[i])) {
				theCars[i].setDirection(theCars[i].getDirection()*-1);
			}
			else {
				int displacement = generator.nextInt(theCars[i].getSpeed());// aqui se genera un numero random para la velocidad
				theCars[i].setxPosition(theCars[i].getxPosition() + (displacement * theCars[i].getDirection()));
			}
		}
	
		int xMax = theCars[0].getxPosition();
		for(int i =1;i<numCars;i++) {
			if(theCars[i].getxPosition()>xMax) {
				xMax=theCars[i].getxPosition();
			}
		}

		for(int i =1;i<numCars;i++) {
			if(theCars[i].getxPosition()==xMax) {
				theCars[i].setColor(Color.orange);
			}
			else {				
				theCars[i].setColor(Color.DARK_GRAY);
			}
		}
		counter++;
		System.out.println("Counter = " + counter);

	}

	public boolean carReachedEdge(Car c) {
		return (((c.getDirection()>=0) && (c.getxPosition()+c.getWidth() >= this.getWidth())) || 
				((c.getDirection()<0) && (c.getxPosition() <= 0)));
	}

}
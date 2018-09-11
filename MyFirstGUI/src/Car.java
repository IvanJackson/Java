import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Car {

	private int xPosition;
	private int yPosition;
	
	public Car(int xPosition, int yPosition) {
		super();
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}
	public int getxPosition() {
		return xPosition;
	}
	public int getyPosition() {
		return yPosition;
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	public int getWidth() {
		return 120;
	}
	public int getHeight() {
		return 80;
		//este valor fue calculado al sumar la alutra de las gomas y el techo
	}
	
	
	public void draw(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		//When drawing the cars, theyare drawn one on top of the other, 
		//And the REctangle constructor is hardcoded to draw it on (0,20)
		//SO we must change it so it accepts the coordinates of the car
		/*
		 * We use the getter "getxPosition() to avoid conflicts
		 * Se llama dinamico se cambia en run time
		 * Se llama static si solo se crea en compile time
		 */
		Rectangle body = new Rectangle(this.getxPosition()+0, this.getyPosition()+20, 120, 30);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(this.getxPosition()+20, this.getyPosition()+50, 20, 20);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(this.getxPosition()+85, this.getyPosition()+50, 20, 20);
		Line2D.Double rearWindow = new Line2D.Double(this.getxPosition()+20, this.getyPosition()+20, this.getxPosition()+40, this.getyPosition()+0);
		Line2D.Double frontWindow = new Line2D.Double(this.getxPosition()+60, this.getyPosition()+0, this.getxPosition()+80, this.getyPosition()+20);
		Line2D.Double roof = new Line2D.Double(this.getxPosition()+40, this.getyPosition()+0, this.getxPosition()+60, this.getyPosition()+0);
		
		g2.setColor(Color.blue);
		g2.fill(body);
		g2.setColor(Color.BLACK);
		g2.draw(rearTire);
		g2.draw(frontTire);
		g2.setColor(Color.blue);
		g2.draw(rearWindow);
		g2.draw(frontWindow);
		g2.draw(frontWindow);
		g2.draw(roof);
	}
}

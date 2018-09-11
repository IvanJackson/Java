
public class Rectangle {
	
	
	double height;
	double width;
	String name;
	
	public Rectangle(double x, double y, double w, double h) {
		this.width = w;
		this.height = h;
//		this.name = n;
		
	}
	
	public double areaOfRectangle() {
		double area = width * height;
		return area;
	}
	
	public double perimeterOfRectangle() {
		double perimeter = (width * 2) + (height * 2);
		return perimeter;
	}
	
	public static String comparingAreas(Rectangle first,  Rectangle second) {
		String winner;
		if(first.areaOfRectangle() > second.areaOfRectangle()) {
			winner = first.name;
		}
		else {
			winner = second.name;
		}
		return winner;
	}
	
	public double getWidth() {
		return this.width;
	}
	
}


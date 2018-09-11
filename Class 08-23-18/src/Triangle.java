
public class Triangle {

// Usar private es mejor pq codigo fuera de esta clase no va a poder acceder esa propiedad
	// Usalo mejor asi para security
	
	
//	private double side1;
//	private double side2;
//	private double side3;
	
	
	// usar public significa que se puede usar donde sea
	public double side1;
	public double side2;
	public double side3;
	
	
	// Esto es un constructor, pq tiene el mimso nombre de la clase
	public Triangle(double s1, double s2, double s3) {
		
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
		
	}
	
	
	// Esto es un instance method, esto se usa para hacerle una pregunta a un objeto
	// Asi que escribele un static, si no le pones la palabra, tienes que tener un objeto de la clase
	// Antes del metodo
	public double areaOfTriangle() {
		double s = (this.side1 + this.side2 + this.side3) / 2.0;
		double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
		return area;

	}
}

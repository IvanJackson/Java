
public class Lecture {

	// Un metodo estatio es un metodo que no nceseita un objeto de la clase para que funcione
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Codigo de da semana pasada
		 
		double side1 = 10.0;
		double side2 = 10.0;
		double side3 = 10.0;
		
		
	
		 //En C se usa en "extern" antes de la funcion de un header file, osea que el file no espera que tenga info, solo una funcion (termina en nombreDeFuncion.h)
		//double s = (side1 + side2 + side3) / 2.0;
		//double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		double area = function.areaOfTriangle(side1, side2, side3);
		System.out.println("The area of the first triangle is " + area);
		
		side1 = 20.0;
		side2 = 20.0; 
		side3 = 20.0;

		area = function.areaOfTriangle(side1, side2, side3);
		System.out.println("The area of the first triangle is " + area);

		side1 = 30.0;
		side2 = 40.0;
		side3 = 50.0;
		
		area = function.areaOfTriangle(side1, side2, side3);
		System.out.println("The area of the first triangle is " + area);
		
		System.out.println("");
		// Conviene crear un file que junte el codigo la parte de s y area para ahorrar tiempo
		// Se debe de crear afuera para que se pueda reusar en otras partes
		
		
		
		// Everything before here is taken from Class 08-21-18
		
		// Maximize code reuse,minimize code replication
		
		// Vamos a refactor el codigo, pero que haga exactamente lo mismo
		
		
		System.out.println("The area of the first triangle is " + function.areaOfTriangle(10.0, 10.0, 10.0));
		System.out.println("The area of the first triangle is " + function.areaOfTriangle(20.0, 20.0, 20.0));
		System.out.println("The area of the first triangle is " + function.areaOfTriangle(30.0, 40.0, 50.0));

		// DataTypes es como un conglomerado de caracteristicas de una misma cosa, junta
		
		// En Java no hay pointers, asi que siempre que se manda un objeto, se usa directamente, ya que los
		// Pointers estan implicitos
		// en Java se llama object referencing
		
		 
		Triangle theTriangle1 = new Triangle(10.0,10.0,10.0);
		 area = theTriangle1.areaOfTriangle();
		 System.out.println(theTriangle1.areaOfTriangle());
		 System.out.println(area);
		 Triangle theTriangle2 = new Triangle(20.0, 20.0, 20.0);
		 System.out.println(theTriangle2.areaOfTriangle());
		 Triangle theTriangle3 = new Triangle(30.0, 40.0, 50.0);
		 System.out.println(theTriangle3.areaOfTriangle());
	}
	
	// Todo el codigo antes de esto es de el lecture anterior
	
	


	}


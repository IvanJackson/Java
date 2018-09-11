
public class lecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     
		 //Codigo de da semana pasada
		 
		double side1 = 10.0;
		double side2 = 10.0;
		double side3 = 10.0;
		
		
	
		 //En C se usa en "extern" antes de la funcion de un header file, osea que el file no espera que tenga info, solo una funcion (termina en nombreDeFuncion.h)
		//double s = (side1 + side2 + side3) / 2.0;
		//double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		double area = functions.areaOfTriangle(side1, side2, side3);
		System.out.println("The area of the first triangle is " + area);
		
		side1 = 20.0;
		side2 = 20.0; 
		side3 = 20.0;

		area = functions.areaOfTriangle(side1, side2, side3);
		System.out.println("The area of the first triangle is " + area);

		side1 = 30.0;
		side2 = 40.0;
		side3 = 50.0;
		
		area = functions.areaOfTriangle(side1, side2, side3);
		System.out.println("The area of the first triangle is " + area);
		
		
		// Conviene crear un file que junte el codigo la parte de s y area para ahorrar tiempo
		// Se debe de crear afuera para que se pueda reusar en otras partes
	}

}

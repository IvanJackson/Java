
public class Chapter_1_Practice_Exercises {

	public static void main(String[] args) {
		//1
		System.out.println("Hola, mi nombre es Ivan");
		//2
		System.out.println(1+2+3+4+5+6+7+8+9*0);
		//3
		System.out.println(1*2*3*4*5*6*7*8*9*10);
		//4
		double funds = 1000.00;
		double interest = 1.05;
		for(int i = 1; i < 4; i++) {
			funds = funds * interest;
			System.out.println("The funds on the year number " + i + " are " + funds);
		}
		//5
		System.out.println("+------+");
		System.out.println("| Dave |");
		System.out.println("+------+");
	}
}
  
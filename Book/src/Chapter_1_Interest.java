
public class Chapter_1_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double inicialFunds = 10000.00;
		
		for (double interest = 1.05; inicialFunds * interest < 20001.0;) {
			inicialFunds = inicialFunds * interest;
			System.out.println(inicialFunds);
		}
	}

}

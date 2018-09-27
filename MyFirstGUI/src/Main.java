import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		JFrame mainFrame = new JFrame("My First GUI");
		// pixel es abbreviatura de picture element
		mainFrame.setSize(500, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// by default, cuando los creas, son invisibles
		mainFrame.setVisible(true);
//		mainFrame.setBackground(null);
//		mainFrame.setShape(null);
		CarStage myCarStage = new CarStage();
		
		int yPos = 0;
		for(int i =0;i<5;i++) {
			myCarStage.addCar(new Car(0,30+yPos,10));
			yPos+=100;
		}
		mainFrame.add(myCarStage);

		//This makes the mainFrame repaint itself without having to move the
		//frame
		while(true) {
			mainFrame.repaint();
			//it sccepts miliseconds, one second is a thousand miliseconds
			//It throws an error because of an exception, so we added
			//The "throws InterrupedException" so it works
			Thread.sleep(1000/30);
		}
	}

}

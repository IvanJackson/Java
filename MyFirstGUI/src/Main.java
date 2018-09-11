import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame mainFrame = new JFrame("My First GUI");
		// pixel es abbreviatura de picture element
		mainFrame.setSize(500, 600);
		// by default, cuando los creas, son invisibles
		mainFrame.setVisible(true);
//		mainFrame.setBackground(null);
//		mainFrame.setShape(null);
		MyComponent myComponent = new MyComponent();
		mainFrame.add(myComponent);

	}

}

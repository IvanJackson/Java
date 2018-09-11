import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Chapter_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("Test Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public class RectangleComponent extends JComponent {
		public void paintComponent(Graphics g)
		{
		// Recover Graphics2D 
		Graphics2D g2 = (Graphics2D) g;
		Rectangle box = new Rectangle(5, 10, 20, 30); 
//		g2.draw(box);
		} }

}

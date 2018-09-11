import javax.swing.JFrame;

public class Chapter_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("Two Rectangles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		RectangleComponent component = new RectangleComponent();
		frame.add(component);
		EllipseComponent circle = new EllipseComponent();
		frame.add(circle);
		LineComponent line = new LineComponent();
		frame.add(line);
	}

}

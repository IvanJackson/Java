import java.awt.Color;

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
		AlienFace face = new AlienFace();
		frame.add(face);
		
		// Self check p.68
		//45
		EllipseComponent circle2 = new EllipseComponent();
		frame.add(circle2);
		//46
		LineComponent vShape = new LineComponent();
		frame.add(vShape);
		//47
		//Done
		//48
		// The RGB color of blue is (0,0,255);
		//49, Drawing a yellow square on a red background. 
		//Here, we create a different frame, bigger than the first one, and hide
		// The first frame
		JFrame frame2 = new JFrame();
		frame2.setSize(500, 600);
		frame2.setTitle("Yellow Square on Red Background");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(false);
		frame2.setVisible(true);
		//This is how you color the background of a frame
		frame2.getContentPane().setBackground(Color.red);
		
		RectangleComponent square = new RectangleComponent();
		frame2.add(square);
		
		
		
	}

}

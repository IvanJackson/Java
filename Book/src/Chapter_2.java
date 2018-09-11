
//import java.awt.Rectangle;

public class Chapter_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width = 20;
		int height;
		// You can, but don't have to, assign a value to the variable you're declaring
		// When you initialize a variable, you are assigning a value to it, otherwise you are just declaring it
		System.out.println(width);
		int area = width * width;
		System.out.println(area);
		//You can declare several same-type variables in the same line like this
		int x, y;
		
		// Declaring a double, which is a integer with a fractional part
		double milesPerGalon = 22.5;
		//declaration of a string
		String greeting = "Hello!";
		
		// Names can only start with a letter or an underscore
		//You cannot use symbols such as ?, % or /, the names are also case sensitive, mpg is not the same as MPG and you cannot use keywords as common words
		// variable names  can't have spaces in them
		
		/* 
		 * You can also comment like this
		 * 
		 */
		
		// when changing the value of an exisiting variable, dont declare it again
		height = 100;
		
		// it is an error to give a variable a value
		
		// The next code will be from the presentation
		
		
		// Functions of the String class
		int lettersInGreeting = greeting.length();
		System.out.println("The amount of characters in the \"greeting\" string are " + lettersInGreeting);
		// .length() returns the amount of characters in a string, does it include white space?
		String space = "   "; //This string contains 3 spaces
		System.out.println("How manycharacters in \"space\"? These are: " + space.length()); 
		// .length includes white space
		// we also have toUpperCase and toLowerCase, which does what it soundslike
		System.out.println(greeting.toUpperCase());
		System.out.println(greeting.toLowerCase());
		
		// Next, we have the .replace(), which takes 2 parameters
		// The string it is looking for and the string that it will use to replace the string it is looking for
		System.out.println(greeting.replace("ello", "ungry"));
		
		/* Let's talk about constructors
		 * They are built with the syntax "new typeOfConstructor"
		 * It is considered a constructor if the method has the same name as the class
		 * and it creates a object named nameOftheConstructor
		 * We store the output of this object in a variable, like this:
		 * Let's say we have a triangle object, then we do:
		 * Triangle nameOfTheConstructor" = new Triangle()*/
		
		// the .getWidth() method return the width of an object
		
		
		// Back to the book
		
		
		// The rectangle class is pre-existing in java
		// It defines a rectangle object with the variables "x" and "y" for coordenates, and "height"
		// and "width" for height and width properties
//		//Let's make a rectangle
//		Rectangle myFirstRectangle = new Rectangle(0, 0, 50, 100, "myFirstRectangle");
//		System.out.println("The width and height of myFirstRectangle are " + myFirstRectangle.width + " and " +myFirstRectangle.height + " , respectively." );
//		System.out.println("This means that the area is " + myFirstRectangle.areaOfRectangle() + " and that the perimeter is " + myFirstRectangle.perimeterOfRectangle());
//		
//		// Let's make a function to compare to rectangles and determine which one is bigger, in area. 
//		Rectangle mySecondRectangle = new Rectangle(0, 0, 100, 150, "mySecondRectangle");
//		
//		System.out.println("The rectangle that was the bigger area is called " + Rectangle.comparingAreas(myFirstRectangle, mySecondRectangle));
//		
		
					/* Mutators are methods that change the object, while Accessors take information out of the object, withoutmodifying it
					 * Let's see an example of a accessor method
//					 */
//		System.out.println(mySecondRectangle.getWidth());
//		// In this scenario, we created a getWidth() function to get the width of the triangle, but since this was an easy function, we could have also done this
//		System.out.println(mySecondRectangle.width);
		
		// Let's see a mutator method
		//Using some type of box.tranlate(50,60) that shifts the x and y coordinates to  some other, would be a mutator method
		// The .toUpperCase method is a mutator, and so is the .toLowerCase
		
		 
		// We made in Rectangle.java the basis for the rectangle creation. yet, we can read in the aplication programing interface (API)
		/* That there already exists a method to do this. all we have to do is write this in the top of the code:
		 * "import java.awt.Rectangle;"
		 * and there. 
		 */
		
		
		
		// When we create an object and give it a name, we are actually creating a variable that references the object that we are refering to.
		//This means that if we create another object that is a copy of an existing object, both will reference the same object and thus when
		// A change is made to one of variables about the object, it will affect all variables that point to the same object
		// Meanwhile, with variables, when a copy is made, they both become independent because the variable holds the value and not a reference
		
	}
}

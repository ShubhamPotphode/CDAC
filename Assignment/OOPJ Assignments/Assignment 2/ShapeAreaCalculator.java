import java.util.Scanner;

public class ShapeAreaCalculator {
	public static void main(String[] args) {
	Scanner scr = new Scanner(System.in);
	
	System.out.println("Select a shape to calculate area: ");
	System.out.println("1. Circle");
	System.out.println("2. Square");
	System.out.println("3. Rectangle");
	System.out.println("4. Triangle");
	System.out.println("Enter your choice (1-4); ");
	int choice = scr.nextInt();
	
	switch (choice) {
	case 1:
		
			System.out.print("Enter the radius of the circle: ");
			double radius = scr.nextDouble();
			double circleArea = Math.PI * radius * radius;
			System.out.println("The area of circle is: " + circleArea);
			break;
	
	
	case 2:
			System.out.print("Enter the side length of the square: ");
			double side = scr.nextDouble();
			double squareArea = side * side;
			System.out.println("The area of the square is: " + squareArea);
			break;
	
	
	case 3:
			System.out.print("Enter the length of the rectangle: ");
			double length = scr.nextDouble();
			System.out.print("Enter the width of the rectangle: ");
			double width = scr.nextDouble();
			double rectangleArea = length * width;
			System.out.println("The area of the rectangle is: " + rectangleArea);
			break;
			
	case 4:
         
	        System.out.print("Enter the base of the triangle: ");
	        double base = scr.nextDouble();
	        System.out.print("Enter the height of the triangle: ");
	        double height = scr.nextDouble();
	        double triangleArea = 0.5 * base * height;
	        System.out.println("The area of the triangle is: " + triangleArea);
	        break;
	        
	default:
        	System.out.println("Invalid choice. Please select a valid shape.");
        	break;
		}
	}
}	
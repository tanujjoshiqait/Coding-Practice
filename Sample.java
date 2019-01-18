package sample;
import java.util.Scanner;

// Calculating Area of Circle, Square, Rectangle and Triangle
public class Sample {
	
	//Calculating area of circle
	public static double CalAreaCircle (Scanner objCircle) {
		
		System.out.println ("Enter the radius of the circle");
		float radius = objCircle.nextFloat();
		return 3.14 * radius * radius;
	}
	
	//Calculating area of Square
	public static double CalAreaSquare (Scanner objSquare) {
		
		System.out.println ("Enter the edge of the Square");
		float edge = objSquare.nextFloat();
		return edge * edge;
	}
	
	//Calculating area of Rectangle
	public static double CalAreaRectangle (Scanner objRectangle) {
		
		System.out.println ("Enter the length and breadth of the rectangle respectively");
		float length = objRectangle.nextFloat();
		float breadth = objRectangle.nextFloat();
		return length * breadth;
	}
	
	//Calculating area of Triangle
	public static double CalAreaTriangle (Scanner objTriangle) {
		
		System.out.println ("Enter the base and height of the triangle respectively");
		float base = objTriangle.nextFloat();
		float height = objTriangle.nextFloat();
		return ((base * height) / 2);
	}
	
	
	public static void main (String[] args) {
		
		Scanner obj = new Scanner (System.in);
		System.out.println ("Enter the figure type");
		System.out.println (" press \n 1 : Rectangle\n 2 : Circle\n 3 : Triangle\n 4 : Square");
		int figType = obj.nextInt();
		
		switch (figType) {
		
		case 1:
			System.out.println("Area of Rectangle is: "+CalAreaRectangle(obj)+ " meter sq.");
			break;
			
		case 2:
			System.out.println("Area of Circle is: "+CalAreaCircle(obj)+ " meter sq.");
			break;
			
		case 3:
			System.out.println("Area of Triangle is: "+CalAreaTriangle(obj)+ " meter sq.");
			break;
			
		case 4:
			System.out.println("Area of Square is: "+CalAreaSquare(obj)+ " meter sq.");
			break;
			
		default:
			System.out.println("Input entered is not valid");
			break;
			
		}
		
	}

}

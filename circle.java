//This is a java program to calculate the diameter, circumference and area of a circle
import java.util.Scanner;
public class circle {

	//begin main method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int r;
		float Area;
		float Circumference;
		float Diameter;
		float PI = (float) Math.PI;

		System.out.println("Enter the radius of the circle");
		r = input.nextInt();

			Diameter = 2*r;
			System.out.printf("Diameter of circle is %.2f%n", Diameter);

			Area = PI*r*r;
			System.out.printf("Area of circle is %.1f%n", Area);

			Circumference = 2*PI*r;
			System.out.printf("Circumference of circle is %.2f%n", Circumference);

	}
}

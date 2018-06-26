//import scanner
import java.util.Scanner;

//import math
import java.lang.Math;

public class bodyMass {

		public static void main(String[] args){
			//Auto generate and start main method

			//Calling Scanner
			Scanner input = new Scanner(System.in);

			//initialising variables
			double weight;
			int feet;
			int inches;

			//prompt user to enter the values of the above variables
			System.out.println("Enter the weight");
			weight = input.nextFloat();

			System.out.println("Enter feet");
			feet = input.nextInt();

			System.out.println("Enter inches");
			inches = input.nextInt();

			//converting and calculation of body mass index
			double weightInKilo = weight* 0.453592;
			double heightInMeters = (((feet * 12) + inches) * .254);
			double bmi = weightInKilo / Math.pow(heightInMeters, 2.0);
			//double bmi = (weight * 703) / Math.pow(inches, 2.0);

			//displaying output
			System.out.println("The body mass is: "  +bmi);

			//interpret BMI
			if (bmi < 18.5 ) {
				System.out.println("Underweight");
			}

			else if (bmi >= 18.5 && bmi < 25) {
				System.out.println("Normal");
			}

			else if (bmi >= 25 && bmi < 30) {
				System.out.println("Overweight");
			}

			else if (bmi >= 30) {
				System.out.println("Obese");
			}

			input.close();
		}
}

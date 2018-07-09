import java.util.Scanner;

public class compare {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		//initialising the variables
		int number1;
		int number2;

		//Enter and store number
		System.out.println("Enter the two numbers");
		number1 = input.nextInt();
		number2 = input.nextInt();

		/*Loops for comparing the two numbers
		if one is greater than the other
		Equal to the other
		greater or Equal to other
		Less than or equal to other or is not equal to the other
		*/
		if (number1 == number2){
			System.out.printf("%d equal to  %d%n", number1, number2);
		}

		if (number1 > number2){
			System.out.printf("%d greater than %d%n", number1, number2);
		}

		if (number1 < number2){
			System.out.printf("%d less then %d%n", number1, number2);
		}
		if(number1 != number2){
			System.out.printf("%d is not equal to %d%n", number1, number2);
		}
		if (number1 >= number2){
			System.out.printf("%d greater then or equal to %d%n", number1, number2);
		}
		if (number1 <= number2){
			System.out.printf("%d less then or equal to %d%n", number1, number2);
		}
		if ((number1/2) == number2){
			System.out.printf("(%d/2) equal to %d%n", number1, number2);
		}

	}
}

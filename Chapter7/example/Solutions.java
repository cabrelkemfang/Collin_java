package Chapter7.example;

import java.util.Scanner;

public class Solutions {

	public static void main(String args[]) {
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		int arCount = Integer.parseInt(scanner.nextLine().trim());

		int[] ar = new int[arCount];

		String[] arItems = scanner.nextLine().split(" ");

		for (int arItr = 0; arItr < arCount; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;

			sum += ar[arItr];
		}
		System.out.println("sum of array values : " + sum);

	}

}



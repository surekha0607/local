package Demo;

import java.util.Scanner;

public class IntegerArraySumCalculator {

	public static void main(String[] args) {

		int[] summation = new int[5];
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter an integer:");
			summation[i] = sc.nextInt();
			sum = sum + summation[i];

		}
		sc.close();

		System.out.println("Grand Total: " + sum);
        //comment
        //mithila ka kan kan

	}
}
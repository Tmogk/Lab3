package co.grandcircus;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		// Prompt user to enter integer between 1 and 100
		System.out.println("Enter and integer between 1 and 100");
		int initialInt = scnr.nextInt();

		// Logic using if else and displaying result

		if (initialInt % 2 != 0) {
			System.out.println(initialInt + " Odd");
		} else if (initialInt % 2 <= 0 && initialInt >= 2 && initialInt <= 25) {
			System.out.println("Even and less than 25");
		} else if (initialInt % 2 <= 0 && initialInt >= 25 && initialInt <= 60) {
			System.out.println("Even");
		} else if (initialInt % 2 >= 0 && initialInt > 60) {
			System.out.println(initialInt + " Even");
		} else if (initialInt % 2 != 0 && initialInt > 60) {
			System.out.println(initialInt + " Odd and over 60");
		} else
			System.out.println("Try again");
		scnr.close();

	}

}

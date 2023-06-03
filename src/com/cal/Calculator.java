package com.cal;

import java.util.Scanner;



public class Calculator {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("select the operations ");
			System.out.println("1 : add \n2 : sub\n3 : mul\n4 : div");

			int input = scan.nextInt();

			System.out.println("enter the first num");
			int num1 = scan.nextInt();

			System.out.println("enter the second num");
			int num2 = scan.nextInt();

			switch (input) {
			case 1:
				System.out.println(num1 + num2);
				break;
			case 2:
				System.out.println(num1 - num2);
				break;
			case 3:
				System.out.println(num1 * num2);
				break;
			case 4:
				System.out.println(num1 / num2);
				break;
			default:
				System.out.println("invalid");

			}
		}

	}

}

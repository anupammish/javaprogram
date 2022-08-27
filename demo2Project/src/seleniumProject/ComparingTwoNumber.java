package seleniumProject;

import java.util.Scanner;

public class ComparingTwoNumber {

	public static void main(String[] args) {
		//int a = 100;
		//int b = 150;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = sc1.nextInt();
		
		//Scanner sc2 = new Scanner(System.in);
		System.out.println("enter the value of b");
		int b = sc1.nextInt();
		
		
		
		if (a > b) {
			System.out.println("a is largest");
		} else if (a<b) {
			System.out.println("b is largest");
		}
		else{
			System.out.println("a and b are equal");
		}
			

	}

}

package methods;

import java.util.Scanner;

//Model 2 with return and no arguments

public class instanceMethod2 {
	
	public int sumOfNat() {
		System.out.println("enter value : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int num = n*(n+1)/2;
		System.out.println("sum of " + n + " natural numbers is ");
		return num;
	}

	public static void main(String[] args) {
		
		instanceMethod2 obj = new instanceMethod2();
		System.out.println(obj.sumOfNat());
		// TODO Auto-generated method stub

	}

}

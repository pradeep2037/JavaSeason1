package methods;

import java.util.Scanner;

//Model 3 with no return having arguments

public class instanceMethod3 {
	
	public void sumOfNat(int n) {
		int res = n*(n+1)/2;
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter value : ");
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		System.out.println("sum of "+value+" natural numbers is ");
		instanceMethod3 obj = new instanceMethod3();
		obj.sumOfNat(value);
	}

}

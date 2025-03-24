package methods;

import java.util.Scanner;

//Model 4 having return and arguments

public class instanceMethod4 {
	
	public int sumOfNat(int num) {
		int n = num*(num+1)/2;
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter value : ");
		Scanner input = new Scanner(System.in);
		int res = input.nextInt();
		System.out.println("sum of "+res+"natural numbers is ");
		instanceMethod4 obj = new instanceMethod4();
		System.out.println(obj.sumOfNat(res));
	}
}

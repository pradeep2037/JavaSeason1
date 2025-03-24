

package methods;

import java.util.Scanner;

//without return and without arguments          

public class instanceMethod1 {
	
	public void sumOfNat() {
		System.out.println("enter value : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int num = n* (n+1)/2;
		System.out.println("sum of " +n+ " natural numbers is "+ num);
		}
	public static void main(String [] args) {
		instanceMethod1 obj = new instanceMethod1();
		obj.sumOfNat();
		}

}



package methods;

public class Method3 {
	
	//static method
	
	public static void sumOfNat(int num) {
		int res = num * (num + 1)/2;
		System.out.println("sum of " + num + " natural numbers is " + res);
	}

	public static void main(String[] args) {
		Method3.sumOfNat(5);
		Method3.sumOfNat(10);

		// TODO Auto-generated method stub

	}
}

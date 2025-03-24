package methods;

public class Method2 {
	
	//non - static method

	public void sumOfNat(int num) {
		int res = num * (num + 1)/2;
		System.out.println("sum of " + num + " natural numbers is " + res);
	}

	public static void main(String[] args) {
		Method2 obj = new Method2();
		obj.sumOfNat(5);
		obj.sumOfNat(10);

	}

}


//code reusability just written method for one time but i'm executing 2 times 

//non - static method unte Aa method A class lo unte Aa class ke object create chese Aa object tho call cheyale
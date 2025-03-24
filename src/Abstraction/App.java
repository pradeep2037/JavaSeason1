package Abstraction;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition obj1 = new Addition();        //Numbers obj = new Addition();
		obj1.compute(3, 5);
		obj1.greet();
		
		Subtraction obj2 = new Subtraction();
		obj2.compute(5, 2);
		
	}
}

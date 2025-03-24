package hierrachialinheritance;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Addition
		Addition obj = new Addition();
		obj.setX(30);
		obj.setY(20);
		obj.add();
		
		
		//Subtraction
		Subtraction obj2 = new Subtraction();
		obj2.setX(10);
		obj2.setY(2);
		obj2.diff();
		
		
		//Multiplication
		Multiplication obj3 = new Multiplication();
		obj3.setX(10);
		obj3.setY(6);
		obj3.multiplicationResult();
	}

}


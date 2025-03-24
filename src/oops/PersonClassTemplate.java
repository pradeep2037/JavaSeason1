package oops;

public class PersonClassTemplate {
	
	//variables
	String name;
	int age;
	long phone;
	
	
	//method
	public void greet() {
		System.out.println("Hi " + name);
	}
	
	
	//static factory method (SFM)
	public static PersonClassTemplate getPerson() {     //if we call getPerson it will call PersonClassTemplate object
		return new PersonClassTemplate();
	}

}

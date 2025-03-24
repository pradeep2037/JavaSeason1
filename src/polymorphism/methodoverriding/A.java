package polymorphism.methodoverriding;

public class A {
	
	protected int a = 10;
	
	public void m1() {
		System.out.println("This is A Method "+a);
	}
	
	public void greet(String name) {
		System.out.println("Hello "+name);
	}
	

}

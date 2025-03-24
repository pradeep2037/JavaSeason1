package polymorphism.methodoverriding;

public class B extends A{
	
	protected int a = 20;
	
	public void m1() {
		System.out.println("This is B Method "+ a);
	}
	
	public void greet(String name) {
		System.out.println("Welcome " + name);
	}
	
	

}

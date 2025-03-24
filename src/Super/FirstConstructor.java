package Super;

public class FirstConstructor {
	int a;
	
	public FirstConstructor() {
		System.out.println("First Constructor : ");
	}
	
	
	public FirstConstructor(int a) {                        
		System.out.println("From parent class override constructor");
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void greet() {
		System.out.println("This is from ParentClass ! ");
	}
}

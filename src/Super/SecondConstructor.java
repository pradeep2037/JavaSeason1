package Super;

public class SecondConstructor extends FirstConstructor{
	
	int a;
	
	SecondConstructor(){
		super(40);                                        //calling parent class constructor did constructor overloading
		System.out.println("Second Constructor : ");
	}
	
	public void putA(int a) {
		this.a = a;
	}
	
	public void display() {
		System.out.println("a is "+super.a);
//		greet();         if you give this it will call same class method
		super.greet();     //it will call ParentClass
	}
	
	public void greet() {
		System.out.println("This is from ChildClass ! ");
	}
}

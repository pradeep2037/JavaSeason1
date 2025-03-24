package practice;

class A{
	void display() {
		System.out.println("class a");
	}
}

class B extends A{
	void display() {
		System.out.println("class b");
	}
}

class C extends B{
	void display() {
		System.out.println("class c");
	}
}


class D extends C{
	void display() {
		System.out.println("class d");
	}
	
	void callingSuperMethod() {
		super.display();
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = new D();
		obj.callingSuperMethod();
	}
}

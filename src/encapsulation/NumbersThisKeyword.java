package encapsulation;

public class NumbersThisKeyword {
	int x;
	int y;

	
	
//	public void setXY(int a, int b) {
//		x = a;
//		y = b;
//	}
//	
//	public void getXY() {
//		System.out.println("x is " + x);
//		System.out.println("y is " + y);
//	}
	
	

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//when local variables same as instance variables
	
	//this keyword is used to call current calling object reference
	//it is a keyword cum operator 
	//it is a predefined non - static variableName
	
	public void getXY() {
		System.out.println("x is " + x);
		System.out.println("y is " + y);
	}
}




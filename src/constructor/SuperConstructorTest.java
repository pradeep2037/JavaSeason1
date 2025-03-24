package constructor;

public class SuperConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//user 1
		SuperConstructor obj1 = new SuperConstructor();
		obj1.getClock();
		
		//user 2
		SuperConstructor obj2 = new SuperConstructor(6);
		obj2.getClock();
		
		
		//user 3
		SuperConstructor obj3 = new SuperConstructor(60,58);
		obj3.getClock();
		
		
		//user 4
		SuperConstructor obj4 = new SuperConstructor(10,5,20);
		obj4.getClock();
	}

}

package constructor;

public class ClockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//User1  		
		Clock obj = new Clock();
		obj.getClock();
		
		
		//User2 
		Clock c1 = new Clock(6);
		c1.getClock();
		
		//User 3
		Clock c2 = new Clock(3,4,2);
		c2.getClock();
		

	}

}

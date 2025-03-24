package polymorphism;

public class ClockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clock obj = new Clock();
		obj.setClock(12);
		obj.setClock(12, 27);
		obj.setClock(2, 20, 46);
		obj.getClock();
	}

}

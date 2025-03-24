package polymorphism;


//Method OverLoading
public class Sum {
	
	//Int
	public void add(int x, int y) {
		int c = x+y;
		System.out.println("sum of "+x+" and "+y+" is "+c);
	}
	
	
	//Int
	public void add(int x, int y, int z) {
		int c = x+y+z;
		System.out.println("sum of "+x+" and "+y+" and "+z+" is "+c);
	}
	
	
	//Double
	public void add(double x, double y) {
		double c = x+y;
		System.out.println("sum of "+x+" and "+y+" is "+c);
	}
	
	
	//Long
	public void add(long x, long y) {
		long c = x+y;
		System.out.println("sum of "+x+" and "+y+" is "+c);
	}
	
	
	//String
	public void add(String a, String b) {
		String c = a+b;
		System.out.println("sum of "+a+" and "+b+" is "+c);
	}
	
}

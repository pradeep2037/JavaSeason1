package constructor;

public class SuperConstructor {
	int hr;
	int min;
	int sec;
	
	
	public SuperConstructor() {
		hr = 10;
		min = 10;
		sec = 10;
	}
	
	
	public SuperConstructor(int hr) {
		this();
		this.hr = hr;
	}
	
	public SuperConstructor(int hr, int min) {
		
		this(hr);
		this.min=min;
		
//		this();
//		this.hr=hr;
//		this.min=min;              we can write like this also
	}
	
	
	public SuperConstructor(int hr, int min, int sec) {
		this(hr,min);
		this.sec=sec;
	}
	
	
	public void getClock() {
		System.out.format("%02d:%02d:%02d", hr,min,sec);
		System.out.println();
	}
}

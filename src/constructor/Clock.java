package constructor;


//constructor overloading
public class Clock {
	int hr;
	int min;
	int sec;
	
	//Default constructor  if we don't have default constructor we can't create object for that default constructor, we can create objects for remaining constructor
	public Clock() {
		hr = 10;
		min = 50;
		sec = 20;
	}
	
	public Clock(int hr) {
		this.hr = hr;
	}
	
	public Clock(int hr, int min) {
		this.hr = hr;
		this.min = min;
	}
	
	public Clock(int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}
	
	public void getClock() {
		System.out.format("%02d:%02d:%02d",hr,min,sec);
		System.out.println();
	}

}

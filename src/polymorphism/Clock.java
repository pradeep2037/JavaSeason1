package polymorphism;


//Method OverLoading
public class Clock {
	int hr;
	int min;
	int sec;
	
	public void setClock(int hr) {
		this.hr = hr;
	}
	
	public void setClock(int hr, int min) {
		this.hr = hr;
		this.min = min;
	}
	
	public void setClock(int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}
	
	
	public void getClock() {
		System.out.format("%02d:%02d:%02d",hr,min,sec);
	}
}

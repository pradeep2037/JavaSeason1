package inheritance;

public class Student {
	
	int rollNo;
	String studentName;
	
	
	public void setDetails(int rollNo,String studentName) {
		this.rollNo = rollNo;
		this.studentName = studentName;
	}
	
	
	public void getDetails() {
		System.out.println("Roll No : "+rollNo);
		System.out.println("Student Name: "+studentName);
	}
	

}

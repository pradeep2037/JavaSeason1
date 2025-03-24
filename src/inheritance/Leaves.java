package inheritance;

public class Leaves extends Marks{
	
	int sickLeave;
	int casualLeave;
	
	
	public void setLeaves(int sickLeave, int casualLeave) {
		this.sickLeave = sickLeave;
		this.casualLeave = casualLeave;
	}
	
	
	public void getLeaves() {
		System.out.println("Total no of leaves taken : "+(sickLeave+casualLeave));
	}
	
	
//	//override
//		public void getDetails() {
//			System.out.println("Roll No : "+rollNo);
//			System.out.println("-----------------------------------------");
//			System.out.println("Student Name: "+studentName);
//			System.out.println("-----------------------------------------");
//		}
}



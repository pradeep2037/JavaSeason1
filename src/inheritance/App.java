
package inheritance;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Leaves obj = new Leaves();
	obj.setDetails(123, "pradeep");
	obj.getDetails();
	obj.setMarks(25, 27, 33);
	obj.getMarks();
	obj.setLeaves(3, 2);
	obj.getLeaves();
	}

}


//single level inheritance          
//student->marks                     
//here we need to create object for the marks to access above levels


//multi level inheritance
//student->marks->leaves
//here we need to create object for the leaves to access above levels

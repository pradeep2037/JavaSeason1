
package polymorphism;

public class AssignmentSolution {
	
	// Method to generate Aadhaar number using only PanCard
	public void generateAdhar(String PanCard) {
		System.out.println("Generating Aadhaar for PanCard: " + PanCard);
		System.out.println("Aadhaar Number: " + AdharNumber());

	}
	
	
	// Method to generate Aadhaar number using PanCard and VoterId
	public void generateAdhar(String PanCard, String VoterId) {
		 System.out.println("Generating Aadhaar for PanCard: " + PanCard + " and VoterId: " + VoterId);
	     System.out.println("Aadhaar Number: " + AdharNumber());		
	}
	

    // Method to generate Aadhaar number using PanCard, VoterId, and Passport
	public void generateAdhar(String PanCard, String VoterId, String Passport) {
		 System.out.println("Generating Aadhaar for PanCard: " + PanCard + ", VoterId: " + VoterId + " and Passport: " + Passport);
	     System.out.println("Aadhaar Number: " + AdharNumber());		
	}
	
	
	
	public String AdharNumber() {
		 // Generate a random 12-digit number as Aadhaar
	    long num = (long) (Math.random() * 1e12);
	    
	    // Format the number as a string and insert spaces every 4 digits
	    String numStr = String.format("%012d", num);  // Ensure it's 12 digits long
	    
	    // Add spaces every 4 digits
	    String formattedNum = numStr.replaceAll("(.{4})", "$1 ");
	    
	    // Return the formatted Aadhaar number
	    return formattedNum.trim();  // .trim() to remove the trailing space
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentSolution obj = new AssignmentSolution();
		obj.generateAdhar("123555");
	}

}

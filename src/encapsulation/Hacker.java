package encapsulation;

public class Hacker {
	
	//here hacker entered the wrong pin so he can't hack the customer and can't get the balanace. Tightly encapsulated.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank obj = new Bank();
		System.out.println(obj.getBalance(123));

	}

}



//we can do tightly encapsulate by making the variables as private. With some public methods we can access the variables
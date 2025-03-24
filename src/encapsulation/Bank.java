package encapsulation;

//Encapsulation

//Hiding data in terms of private variables and private methods within a class and 
//restricting direct access to them.They can only be accessed and modified through public methods(Getters & Setters)

public class Bank {
	
	private double balance = 10000.0;
	
	public double balances = 20000;
	
	public double getBalance(int pin) {
		
		//validation
		if(pin==2037) {
			return balance;
		}
		else {
			System.out.println("Invalid Pin Entered");
			return 0;
		}
	}
	
	public void setBalance(double deposit) {
		balance = balance + deposit;
	}
}



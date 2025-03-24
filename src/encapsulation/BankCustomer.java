package encapsulation;

public class BankCustomer {
	
	public static void main(String[] args) {
		Bank obj = new Bank();
		
		System.out.println(obj.balances);
		
		//retrieving bank balance
		System.out.println(obj.getBalance(2037));
		
		//setting bank balance
		obj.setBalance(2000);
		System.out.println(obj.getBalance(2037));
	}
}


public class SavingsAccount extends BankAccount{
	
	private double rate = 2.5;
	private int savingsNumber = 0;
	
	
	
	
	public SavingsAccount(String name, double initialBalance) {
		
		super(name, initialBalance);
		
		setAccountNumber( getAccountNumber() + "-" + savingsNumber);
				
	}
	
	public void postInterest() {
		double monthlyInterest = (getBalance() * (rate/100))/12;
		deposit(monthlyInterest);
	}
	
	@Override
	public String getAccountNumber() {
		return super.getAccountNumber();
	}
	
	public SavingsAccount(SavingsAccount original, double initialBalance) {
		super(original.getOwner(), initialBalance);
		
		this.savingsNumber = original.savingsNumber + 1;
		
		setAccountNumber(original.getAccountNumber().substring(0, original.getAccountNumber().lastIndexOf('-')) + "-" + this.savingsNumber);	   	    
	}


}

package thuongtruong1009;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount momsSavings = new SavingAccount(0.5);	
		CheckingAccount harrysChecking = new CheckingAccount(100);	
		
       	momsSavings.deposit(10000);
       	momsSavings.transfer(2000, harrysChecking);     
       	
		harrysChecking.withdraw(1500);
		harrysChecking.withdraw(80);      
		
		momsSavings.transfer(1000, harrysChecking);
		
		harrysChecking.withdraw(400);      
		
		momsSavings.addInterest();
		
		harrysChecking.deductFees();
		
		System.out.println("Savings balance = "+ momsSavings.getBalance());
		System.out.println("Checking balance = " + harrysChecking.getBalance());
	}
}

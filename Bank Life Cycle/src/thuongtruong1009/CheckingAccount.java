package thuongtruong1009;

public class CheckingAccount extends BankAccount{ 
	private static final int FREE_TRANSACTIONS = 0;
	private static final int TRANSACTION_FEE = 0;
	int transactionCount;
	public CheckingAccount(double initialBalance){	
		super(initialBalance);
		transactionCount = 0; 
	}
	public void deposit(double amount) {  
		transactionCount++;
	       super.deposit(amount); 
    }	    
	public void withdraw(double amount)	{  
		transactionCount++;
	       super.withdraw(amount); 
    }
	public void deductFees() {  
		int transactionCount = 0;
		if (transactionCount > FREE_TRANSACTIONS){  
			double fees = TRANSACTION_FEE *
	        (transactionCount - FREE_TRANSACTIONS);
	          super.withdraw(fees);
	    }
	    transactionCount = 0;
	}
}

public class Bank {
	public static void main(String[] args) {
		IAccount[] accounts = new IAccount[3];
		accounts[0] = new SavingsAccount();
		accounts[1] = new FDAccount();
		accounts[3] = new ReccuringFDAccount();
		
		for (IAccount iAccount : accounts) {
			iAccount.deposit();
		}
	}

}

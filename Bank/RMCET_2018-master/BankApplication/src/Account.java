
public class Account {
	
	private int accountNumber;
	private int amount;
	private int accountNumber2;

	public int getAccountNumber2() {
		return accountNumber2;
	}
	public void setAccountNumber2(int accountNumber2) {
		this.accountNumber2 = accountNumber2;
	}
	public Account(int accountNumber2) {
		super();
		this.accountNumber2 = accountNumber2;
	}
	public Account(int accountNumber, int amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}

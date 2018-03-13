
public class Client {
	
	

	public static void main(String[] args) {
		
		ICICIBank bank = new ICICIBank();
		System.out.println(bank.createAccount(101,5000));
		
		System.out.println(bank.createAccount(102,10000));
		
		
		try
		{
			System.out.println("Total balance = "+bank.depositAmount(101, 2000));
			
			System.out.println("After Withdraw "+bank.WithdrawAmount(101, 8000));
			
	
		}catch(InvalidAccountNumberException ian)
		{
			System.out.println("invalid account number");
		}
		catch(InvalidAmountException iae)
		{
			System.out.println();
			
		}

	}

}

package Exception;

public class Account1 {

	private long balance;
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance+=money;
	}
	
	public void withdraw(int money) throws BalanceInSufficientException1{
		if(balance < money) {
			throw new BalanceInSufficientException1("잔고부족:"+ (money-balance) + "모자람");
		}
		balance-=money;
	}
}

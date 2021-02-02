package Exception;

public class AccountExample1 {

	public static void main(String[] args) {
		Account1 account = new Account1();

		account.deposit(10000);
		System.out.println("¿¹±Ý¾×:"+account.getBalance());
		
		try {
			account.withdraw(500000);
		}
		catch(BalanceInSufficientException1 e) {
			String message=e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}

	}

}

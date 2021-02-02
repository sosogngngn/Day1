package Exception;

public class AccountExample {

	public static void main(String[] args) {
	
		Account account = new Account();
		account.deposit(10000);
		System.out.println("���ݾ�:"+account.getBalance());
		
		try {
		account.withdraw(50000);

	}
		catch(BalanceInSufficientException e) {
			String message = e.getMessage(); // �״�� ���� ������ �����ϴ� �żҵ�(e.getMessage)
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
/*
* e.getMessage() : ������ ������ �����ϰ� ����մϴ�.
  e.toString() : ������ Exception ����� ������ ����մϴ�.
  e.printStackTrace() : ������ �߻��ٿ����� ã�Ƽ� �ܰ躰�� ������ ����մϴ�.
 */
		}

}
}

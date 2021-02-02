package Exception;

public class AccountExample {

	public static void main(String[] args) {
	
		Account account = new Account();
		account.deposit(10000);
		System.out.println("예금액:"+account.getBalance());
		
		try {
		account.withdraw(50000);

	}
		catch(BalanceInSufficientException e) {
			String message = e.getMessage(); // 그대로 오류 내용을 저장하는 매소드(e.getMessage)
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
/*
* e.getMessage() : 에러의 원인을 간단하게 출력합니다.
  e.toString() : 에러의 Exception 내용과 원인을 출력합니다.
  e.printStackTrace() : 에러의 발생근원지를 찾아서 단계별로 에러를 출력합니다.
 */
		}

}
}

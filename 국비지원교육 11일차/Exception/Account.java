package Exception;

public class Account {
	private long balance; //외부에서 balance를 조작하지 못하게 private 으로 차단
	
	public long getBalance() {
		return balance; //Account class 내부에서 계산한 balanc 값을 외부로 출력 하기 위함.
	}
	
	//예금
	public void deposit(int money) {
		balance+=money;
	}
	
	//출금시 예외 발생가능 -> ex)10만원 뽑으려하는대 계좌에 5만원 밖에 없을때
	public void withdraw(int money) throws BalanceInSufficientException {
		//예외를 BalanceInSufficientException으로 인가하겠다. (BalanceInSufficientException 클래스에서 이 예외를 처리해줘야함. 떠넘긴 것임.)
		if(balance<money) {
	    throw new BalanceInSufficientException("잔고부족"+(money-balance)+"원 부족");
	}
	else {
		balance-=money;
	}

	}
}

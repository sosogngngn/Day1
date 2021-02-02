package Exception;
//사용자 정의 예외처리 -> 은행 잔액 부족
public class BalanceInSufficientException extends Exception {
	//예외처리의 최상위 부모를 상속한다
	public BalanceInSufficientException() {}
	//생성자 생성
	public BalanceInSufficientException(String message) {
	//오류메세지를 읽어 오겠다.
   // throw new BalanceInSufficientException("잔고부족"+(money-balance)+"원 부족"); 이걸 가져옴
		super(message);
	//message 인자는 부모(Exeption)에서 부터 상속된 것이다.
	}

}

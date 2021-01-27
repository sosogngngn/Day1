package chap07;

public class Account_getter_setter {
	static final int MIN_BALANCE=0;
	static final int MAX_BALANCE=1000000;
	private int balance ;

	void setBalance(int balance) {
		if(balance<=MAX_BALANCE&&balance>=MIN_BALANCE) {
			this.balance=balance;
			return;
		}
		else {
			return;
		}
	}
	
	int getBalance() {
		return this.balance;
	}
	
	
}

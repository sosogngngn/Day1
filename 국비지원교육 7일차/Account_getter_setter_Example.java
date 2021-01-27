package chap07;

public class Account_getter_setter_Example {

	public static void main(String[] args) {
		Account_getter_setter account = new Account_getter_setter();
		
		account.setBalance(1000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());

	}

}

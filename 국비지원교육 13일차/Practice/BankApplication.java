package Practice;
import java.util.Scanner;
public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("-------------------------------------------");
		    System.out.println("1.계좌생성 | 2.계좌목록 | 3. 예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			int num = sc.nextInt();
			
			if(num==1){
				creatAccount();
			}
			
			if(num==2) {
				accountList();
			}
			
			if(num==3) {
				deposit();
			}
			
			if(num==4) {
				withdraw();
				
			}
			
			if(num==5) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}
	
	private static void creatAccount() {
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("계좌주: ");
		String owner = sc.next();
		System.out.println("초기입금액");
		int balance = sc.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		for(int i=0 ; i<accountArray.length; i++) {
		if(accountArray[i]==null) {
			accountArray[i]= newAccount;// 
			//i=0 일때 accountArray[0]에 첫번째 계좌(객체)를 넣어라 n
			System.out.println("결과: 계좌가 생성되었습니다.");
			break;
		}
			
		}
	}
	
	private static void accountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		for(int i=0 ; i<accountArray.length;i++)
		{  Account account = accountArray[i]; 
		// i=0 일때 accountrArray[0] 값들을 account(임시 객체)에 넣어라.
			if(accountArray[i]!=null) {
				System.out.print(account.getAno());
				System.out.print("\t");
				System.out.print(account.getOwner());
				System.out.print("\t");
				System.out.println(account.getBalance());
				System.out.println();
			}
		}
	}

	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		System.out.print("계좌번호: ");
	    String ano = sc.next();
	    System.out.print("예금액:" );
	    int money = sc.nextInt();
	    Account account = findAccount(ano);
	    if(account == null) {
	    	System.out.println("결과: 계좌가 없습니다.");
	    	return;
	    }
	    account.setBalance(account.getBalance() + money);
	    System.out.println("결과: 예금이 성공되었습니다.");
	}
	
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		System.out.print("계좌번호: ");
	    String ano = sc.next();
	    System.out.print("출금액:" );
	    int money = sc.nextInt();
	    Account account = findAccount(ano);
	    if(account == null) {
	    	System.out.println("결과: 계좌가 없습니다.");
	    	return;
	    }
	    account.setBalance(account.getBalance() - money);
	    System.out.println("출금이 성공되었습니다.");
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0 ; i<accountArray.length;i++) {
			String dbAno = accountArray[i].getAno();
			if(dbAno.equals(ano)) {
				account = accountArray[i];
				break;
			}
		}
	return account;
}
}

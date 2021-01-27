package chap07;
import java.util.Scanner;
public class BankApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean run;
		
		while(true) {		
			System.out.println("----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("----------------------------------------------------");
			
			System.out.print("선택>");
			int select = sc.nextInt();
	
			String[] Account = new String[2];
			
			if(select==1) {
				System.out.println("-------");
				System.out.println("계좌생성");
				System.out.println("-------");
				for(int i =0 ; i<3 ; i++) {
						
					if(i==0) {
						System.out.print("계좌번호:");
						Account[i]=sc.next();
					}
					
					if(i==1) {
						System.out.print("계좌주:");
						Account[i]=sc.next();
					}
					
					if(i==2) {
						System.out.print("초기입금액:");
						Account[i]=Integer.toString(sc.next());
						System.out.println("계좌가 생성되었습니다.");
					}
				}
				
		}
			
			else if(select==2) {
				System.out.println("-------");
				System.out.println("계좌목록");
				System.out.println("-------");
				
				
				
				}
				
			
		}

	}

}


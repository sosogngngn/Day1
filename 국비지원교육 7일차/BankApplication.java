package chap07;
import java.util.Scanner;
public class BankApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean run;
		
		while(true) {		
			System.out.println("----------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.���� ");
			System.out.println("----------------------------------------------------");
			
			System.out.print("����>");
			int select = sc.nextInt();
	
			String[] Account = new String[2];
			
			if(select==1) {
				System.out.println("-------");
				System.out.println("���»���");
				System.out.println("-------");
				for(int i =0 ; i<3 ; i++) {
						
					if(i==0) {
						System.out.print("���¹�ȣ:");
						Account[i]=sc.next();
					}
					
					if(i==1) {
						System.out.print("������:");
						Account[i]=sc.next();
					}
					
					if(i==2) {
						System.out.print("�ʱ��Աݾ�:");
						Account[i]=Integer.toString(sc.next());
						System.out.println("���°� �����Ǿ����ϴ�.");
					}
				}
				
		}
			
			else if(select==2) {
				System.out.println("-------");
				System.out.println("���¸��");
				System.out.println("-------");
				
				
				
				}
				
			
		}

	}

}


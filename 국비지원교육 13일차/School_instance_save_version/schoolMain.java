package School_instance_save_version;
import java.util.Scanner;
public class schoolMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		teacher teacher = new teacher();
		
		while(true) {
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 총점 출력");
			System.out.println("3.학생 평균 출력");
			System.out.println("4.프로그램 종료");
			
			int number = sc.nextInt();
			
			
			if(number==1) {
				teacher.Input();
			}
			
			if(number==2) {
				teacher.sum();
				
			}
			
			if(number==3) {
				teacher.avg();
				
			}
			
			if(number==4) {
				System.out.println("프로 그램 종료");
				break;
			}
		}
		
		

	}

}

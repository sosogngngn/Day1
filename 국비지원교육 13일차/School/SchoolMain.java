package School;
import java.util.Scanner;
public class SchoolMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Teacher teacher = new Teacher();
		int number;
		while(true) {
			
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 총점 출력");
			System.out.println("3. 학생 평균 출력");
			System.out.println("4. 프로 그램 종료");
			System.out.print("번호를 입력하세요: ");
			number=sc.nextInt();
			if(number==1) {
			  teacher.inPut();
			}
		
			
			if(number==2) {
		      teacher.sum();
				
			}
			
			if(number==3) {
				teacher.avg();
			}
			
			if(number==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
	
			
			
		}

	}

}

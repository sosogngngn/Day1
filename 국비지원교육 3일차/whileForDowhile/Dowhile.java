package whileForDowhile;
import java.util.Scanner;


public class Dowhile {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in); //--> 스캐너 객체 생성
		String inputString;
		
		do {
			//System.out.println(">>>");
			//enter치고 입력하면 왜 출력값이 같게 안나오지?
		
			inputString = scanner.nextLine();	
		    System.out.println(inputString);		
		}
		while(! inputString.equals("q")) ; //-> do while 에서 wile 괄호 옆에 반드시 ; 찍어야함
		{
			System.out.println();
			
		}
		System.out.println("프로그램종료");	
	}

}
//입력 받는 방법 (scanner 사용하기)
//1. 맨위에 impotr java.util.Scanner; 선언해주고
//2. Scanner scanner= new Scanner(System.in); -> scanner 객체 생성
//3. intputStrint = scanner.nextLine(); 키보드로 입력한 문자 받기
//Do 부터 실행하고 While 문으로 감.
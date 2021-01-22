package ScannerFile;

import java.util.Scanner;
public class ScannerExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String str1 = sc.next(); //next와 nextLine 차이알기
	
		System.out.print("정수를 입력하세요: ");
		int i = sc.nextInt();
		
		System.out.print("실수를 입력하세요: ");
		double a = sc.nextDouble();
		
		sc.close();
		
		System.out.println("입력된 문자열 : " + str1);
		System.out.println("입력된 정수: "+ i);
		System.out.println("입력된 실수: "+ a);
		

	}

}
//문자열, 정수, 실수 Scanner로 입력받고 출력하는 방법
/* improt java.util.Scanner;
 * 
 * Scanner sc = new Scanner(System.in);
 * String str = sc.nextLine();-> 문자열 사용자에게 입력받는 법
 * int num = sc.nextInt(); -> 정수 사용자에게 입력받는 법
 * double num = sc.nextDouble(); -> 실수 사용자에게 입력받는 법* 
 */

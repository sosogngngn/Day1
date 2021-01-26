package method;
import java.util.Scanner;
public class CalculatorExample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Caculator myCal = new Caculator();
		myCal.poweron();
		
		System.out.print("정수 2개를 입력하세요:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result1 = myCal.plus(x,y);
		System.out.println("result1 = "+result1);
		
		System.out.print("정수 2개를 입력하세요:");
		double q =sc.nextDouble();
		double w =sc.nextDouble();
		double result2 = myCal.divide(q, w);
		System.out.println("result2: "+result2);
		
		myCal.poweroff();	

	}

}

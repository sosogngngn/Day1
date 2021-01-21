package ArithmeticOperator;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		int v1=5;
		int v2=2;
		
		int result1= v1 + v2;
		System.out.println("result1="+result1);
		
		int result2= v1 * v2;
		System.out.println("result2="+result2);
		
		int result3= v1 / v2;
		System.out.println("result3="+result3);
		
		int result4= v1 % v2;
		System.out.println("result4="+result4);
		
		int result5= v1 - v2;
		System.out.println("result5="+result5);
		
		double result6= (double)v1 / v2; //2.5가 나옴! double은 실수 자료형이니까!
		//실수/정수 -> 실수
		System.out.println("result6="+result6);

	}

}
//사칙연산에 대한 코딩!
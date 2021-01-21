package bitLogicalExam;

public class BitLogicalExam {

	public static void main(String[] args) {
		System.out.println("45 & 25=" +(45 & 25));//비트의 논리곱
		//00101101
		//00011001
		//논리곱(AND)
		//----------
		//00001001 -> 9
		
		System.out.println("45 | 25=" +(45 | 25));//비트의 논리합
		//00101101
		//00011001
		//논리합(OR)
		//----------
		//00111101 ->61
		
		System.out.println("45 ^ 25=" +(45 ^ 25));
		//00101101
		//00011001
		//배타적 논리합(XOR) -> 1, 0 다를 때만 1 나머지는 전부 0
		//----------
		//00110100 ->52
		
		System.out.println("~45=" +(~45));
		//00101101
		//논리 부정(NOT)-> 1은 ->0 으로 0->1으로 비트 반전
		//----------
		//11010010 -> -46
		
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(45));
		System.out.println("||");
		System.out.println(toBinaryString(45));
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str="0"+str;
		}
		return str; //이 String toBinaryString 함수는 논리곱, 논리합 등의 논리 연산시
		//십진수로 변환해서 나오기 때문에 해당 숫자를 이진수로 볼수 없는 것을.
		//십진수를 이진수로 변환해주는 함수이다.
	}

}

package bit_reverse;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		int v1=10; //int 자료형 10진수 10을 이진수로 표현하면 ->00000000000000000000000000001010 
		int v2=~v1;//~(비트 반전연산)                     11111111111111111111111111110101
		int v3=~v1 +1;//                              11111111111111111111111111110110 
		System.out.println(toBinaryString(v1)+ " (십진수: " + v1 + ")");//10출력
		System.out.println(toBinaryString(v2)+ " (십진수: " + v2 + ")");//-11출력
		System.out.println(toBinaryString(v3)+ " (십진수: " + v3 + ")");//-10출력
		System.out.println();
		
		int v4 = -10;//     11111111111111111111111111110110 
		int v5 = ~v4;//     00000000000000000000000000001001
		int v6 = ~v4 + 1;// 00000000000000000000000000001010
		
		System.out.println(toBinaryString(v4)+ " (십진수: " + v4 + ")");
		System.out.println(toBinaryString(v5)+ " (십진수: " + v5 + ")");
		System.out.println(toBinaryString(v6)+ " (십진수: " + v6 + ")");
		
	}

	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str="0" + str;//10진수를 2진수로 표현한 후 앞을 0으로 채운다는 말
		}//str.lenth -> Integer.toBinaryString(value)의 길이(integer니 32비트 즉 길이는 32) 
		return str;
	}
}
//10진수를 이진수로 표현하면 32자리수로 표현된다. 
//int는 4byte(=4*8bit=32bit)니까 최대 32bit 까지 표현 가능하다.
//integer.toBinaryString 은 자바에서 제공하는 메서드로 integer(10진수)를 받아 binary(2진수)로 표현
//int의 class 형이 integer(int 기능을 포함하면서 다른 기능이 많다)
//함수를 콜해서 쓸줄 알아야함 (내가 전부다 개발할 순 없음)
//클래스 안에 정의된 함수를 매서드라고함.
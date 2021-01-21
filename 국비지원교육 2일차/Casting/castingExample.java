package Casting;

public class castingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue=(char)intValue; //int를 char로 강제 형변환
		System.out.println(charValue);//'가' 문자출력
		
		long longValue=500;
		intValue=(int)longValue; //long 타입을 int로 강제형변환
		System.out.println(intValue);//500 출력 int 범위에있으니까 짤리는 값은 없음
		
		double doubleValue=3.14;
		intValue = (int)doubleValue;//double 타입을 int로 강제형변환
		System.out.println(intValue);//3 출력

	}

}


//강제형변환(Casting)
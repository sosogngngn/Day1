package TEST;

public class test {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		//10 출력 작은거 -> 큰거(자동형변환)
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드=" + intValue);
		//가에 대한 유니코드 44032 출력 
		
		intValue = 500 ;
		long longValue = intValue;
		System.out.println(longValue);
		//500 그대로 출력 작은형(int)->큰형(long) 자동형변환
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		//200.0 작은형(int)->큰형(double) 정수->실수 소숫점 첫째짜리까지 출력
		

	}

}

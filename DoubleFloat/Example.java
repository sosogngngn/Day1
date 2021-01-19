package DoubleFloat;

public class Example {

	public static void main(String[] args) {
	//실수값 지정
		double var1 = 3.14;//3.14출력
		//float var2 = 3.14;//컴파일 에러(Type mismatch)
		//왜? 에러? 실수는 기본 디폴트값이 Double 임.
		//float 는 숫자뒤에 F를 표시해줘야 에러가 나지 않는다.
		float var3 = 3.14F;//3.14출력
		
		//정밀도 테스트
		double var4 = 0.1234567890123456789;//0.12345678901234568 출력
		float var5 = 0.1234567890123456789F;//0.12345679 출력
		//double이 더 정밀함을 알수 있다.
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);

		//e 사용하기
		int var6 = 3000000;
		double var7 = 3e6;//3곱하기 10의 6제곱
		float var8 = 3e6F;//F 붙이는거 꼭 명심하고
		double var9 = 2e-3; //2 곱하기 10의 -3제곱
		//10의 3제곱을 e3 으로 표현할 수 있다.

		
		System.out.println("var6: " + var6);//그대로 출력
		System.out.println("var7: " + var7);//실수니까 소수 첫째짜리까지 표현
		System.out.println("var8: " + var8);//실수니까 소수 첫째짜리까지 표현
		System.out.println("var9: " + var9);//0.002 출력
		
	}

}
//float는 가수부분이 24비트 지수부분 8bit
//double은 가수부분이 54비트 지수부분이 16bit

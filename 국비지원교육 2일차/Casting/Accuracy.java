package Casting;

public class Accuracy {

	public static void main(String[] args) {
	 int num1 = 123456780;
	 int num2 = 123456780;
	 
	 float num3 = num2;
	 num2 = (int) num3;
	 
	 int result = num1 - num2 ;
	 System.out.println(result);

	}

}

//double num3 = num2 일때는 0이 나와는대
//float num3 = num2 일때는 왜 손실이 발생할까? 결과가 -4임.
//int를 float로 변환할때 손실이 발생함 float 지수(8비트), 가수(23bit) 부분을 넘어 갔기 때문임
//-> 즉 가수부분을 넘어버림 int는 32bit이나 float는 가수부분이 23bit라서 손실이 발생함.
//0.12345x10E1 -> 가수 0.12345 지수 1 이 됨.
//double은 지수(11비트) + 가수부분이 (52bit)
//즉 float 보다 double 이 더 정밀한 값을 저장할 수 있다.
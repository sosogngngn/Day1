package Sign;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x=-100;
		int result1= +x; //(-(+100))=100)
		int result2= -x; //(-(-100))=100)
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		
		short s=100;
		//short result3 = -s;  
		//->컴파일에러 short 자료형인 s변수가 -연산 함 
		//->integer로 바뀌어서 자료형이 int가 되서 컴파일 에러가 난것임.
		int result3=-s; //(-(-100))=100)
		System.out.println("result3="+ result3);

	}

}

//단항연산도 연산이다! 정수끼리의 연산! -> int로 자료형 변환된다!
package Operation;

public class operationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1=10;
		byte byteValue2=20;
		//byte byteValue3=byteValue1 + byteValue2; 
		//->컴파일 에러 이유는? 정수끼리의 연산은 무조건 int로 바꿔서 연산 하기 때문이다. 
		//즉 byteValue3가 int자료형이 된다는 말임.
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(intValue1); //30 출력
        
        byte charValue1='A';
		byte charValue2=1;
		//char charValue3= charValue1 + charValue2; 
		//->컴파일 에러 이유는? 정수끼리의 연산은 무조건 int로 바꿔서 연산 하기 때문이다. 
		//즉 charValue3가 int자료형이 된다는 말임.
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드="+ intValue2);// 유니코드 = 66 출력
        System.out.println("출력문자="+ (char)intValue2);// 출력문자=B 출력
        
        int intValue3 = 10;
        int intValue4 = intValue3/4;
        System.out.println(intValue4);//2 출력
        
        int intValue5 = 10;
        //int intValue6 = 10/4.0; 
        //->컴파일에러 실수로 나눴으니까 intValue6 은 자료형이 double이 되어야함.
        double doubleValue = intValue5/4.0;
        System.out.println(doubleValue);//2.5 출력
	}

}

//원시 자료형에 대한 타입 변환.
//이걸 잘 이해하면 객체 지향에서 클래스간에 타입변환에서 유리함
//정수의 연산은 무조건!!!!!!!!!!! int로 변환해서 연산된다!!!!! 정수의 연산은 int가 디폴트값임
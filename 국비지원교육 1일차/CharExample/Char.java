package CharExample;

public class Char {

	public static void main(String[] args) {
	 char c1 = 'A' ; //문자를 직접 저장
	 char c2 = 65 ; //'A'가 10진수로 65 임
	 char c3 = '\u0041'; //'A'가 16진수로 \u0041 임

	 char c4 = '가'; // 문자를 직접 저장
	 char c5 = 44032; //십진수로 저장 '가'가 10진수로 44032임
	 char c6 = '\uac00' ; //16진수로 저장 '가' 16진수로 \uac00임
	 
	 int uniCode = c1; //유니코드 얻기 c1은 문자의 성질이 바뀜 자동형변환이 됨 int가 char보다 크기때문에 자동으로 바뀜
	
	  System.out.println(c1); //문자그대로 A 출력
	  System.out.println(c2); //Char(문자타입으로 선언했으니) A가 출력
	  System.out.println(c3); //Char(문자타입으로 선언했으니) A가 출력
	  System.out.println(c4); //문자그대로 가 출력
	  System.out.println(c5); //Char(문자타입으로 선언했으니) '가'가 출력
	  System.out.println(c6); //Char(문자타입으로 선언했으니) '가'가 출력
	  System.out.println(uniCode);// 자동형변환으로 정수 65가 출력
	  
	}

}

//문자형은 정수다. 이것을 알아야함 int로 형변환이 된다. (큰쪽으로 형변환이됨)
//int는 4바이트 범위고 char는 2바이트 범위니까 자동으로 형변환이 되는 것임
//C1,C2,C3~C6까지 전부 문자를 출력하지만 uniCode는 자동형변환이 일어나서 정수가 출력된 것임.
//이 이유가 char(2byte) <int(4byte) 이기 때문에 자동 형변환이 일어난 것임.
//2글자 이상이 문자열임 이것은 " " 붙여야하고 문자는 ' '
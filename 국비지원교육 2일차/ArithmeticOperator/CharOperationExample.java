package ArithmeticOperator;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1= 'A' +1; 
		//연산전에 같은 타입으로 바뀌어야 된다. char은 정수형임 디폴드 값인 int형으로 형변환이 일어난다
		// 'A' -> 65(int로) 로 형변환이 일어나고 여기에 +1 
		//이 돼서 66이 된상태에서 이것을 char로 선언해 줬으니 66에 해당하는 'B'가 c1에 저장된다.
        char c2= 'A';
        //char c3 = c2 +1; //컴파일 에러 why?
        //char c3 = c2(연산할때 int로 바뀜) + 1(int 리터럴); -> int로 c3을 선언해야 
        //오류가 안뜨는대 char 이니 에러가 나는거임.
        //에러가 안나게 하려면 char -> int 바꾸거나 (char)(c2+1)로 캐스팅해주면 됨.
        //즉. 변수와 리터럴은 연산이 불가능하다. 리터럴은 리터럴끼리 변수는 변수끼리 연산해야함.
        System.out.println("c1:"+ c1);
        System.out.println("c2:"+ c2);
        //System.out.println("c3:"+c3); ->컴파일 에러
	}

}

package p01.variable;

public class VariableEx2 {

	//1.생성자(Constructor): 객체생성시 초기값 저장
	public VariableEx2() {
		System.out.println("3.기본생성자: 객체 생성시 초기값 저장 용도");
	}
	
	//2.변수 
	String str1 ="홍길동"; //한번 객체생성
	String str2 ="홍길동"; //위에서 생성한 객체 주소값을 가져다가 쓴다.
	
	//실행시 객체 생성
	String str3 = new String("홍길동");//한번 객체 생성
	String str4 = new String("홍길동");//또다른 객체 생성
	
	
	
	
	//3.초기화 블럭
	//1)static 초기화 블럭
	static {
		System.out.println("1.static 초기화 블럭: 프로그램 실행시 최초에 한번 수행"); // 메인에 있는 변수, 메소드 전부다 주석처리해도 수행한다. RAM 에 있으니까 수행함.
	}
	
	{
	 System.out.println("2.Instance 초기화 블럭:: 객체생성시 가장먼저 수행(생성자 보다 먼저)"); // 객채 생성된것이 없기때문에 당연히 수행x
	}
	
	//4.메소드
	public static void main(String[] args) {
		
		
		  VariableEx2 v2 = new VariableEx2(); 
		   int result = v2.add(10);
		  System.out.println(result);
		  
		  int result2 = v2.add2(10);//생성된 객체 주소값을 통해서 접근하므로 결과는 나오지만 경고 메시지 표시 -> static이여서 RAM에 이미 있는대 
		  //왜 굳이 클래스 전체를 RAM에 다시 복사해서 비효율적으로 하냐는 거임
		  System.out.println(result2);
		  
		  int result3 = add2(10);//RAM에 있어서 객체 생성이 불필요 System.out.println(result3);
		  
		  int result4 = VariableEx2.add2(10); // static메소드 호출 사용 :: 클래스명.메소드이름 => 단,
		  //메소드가 같은 클래인 경우 "클래명" 생략 System.out.println(result4); //그니까 불필요한 짓을 한거임 클래스 이름
		  //써주는것
		 
		  System.out.println(v2.str1);//실제값(초기값)
		  System.out.println(v2.str2);
		  System.out.println(v2.str3);
		  System.out.println(v2.str4);
		  
		  System.out.println(v2.toString());//주소값
	}
	
	//a -> Parameter(인자) 변수
	int add(int a) {
		return a+10;
	}
	
	//a -> Parameter(인자) 변수
		static int add2(int a) { // RAM에 있다.
			return a*a;
		}


}

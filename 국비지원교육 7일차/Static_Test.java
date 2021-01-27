package chap07;

public class Static_Test {
	int test1;
	void Test1 () {
  		
	}

	
	static int test2;
	static void Test2() {
		
	}
	//정적 블록
	static {
		//test1=10;//this.a = 10; -> 컴파일 에러 : 생산자로 초기화 해야함. static 영역에서는 인스턴스를 초기화할 수 없다.: main 에서 new로 생성
		test2=0; //-> static 으로 선언된 것이라 초기화 가능 -> main에서 인스턴스(객체) 생성 x
		//Test1();//static 영역에서는 객체가 생성되지 않기 떄문에 컴파일 에러
		Test2();	
	}
	
	static void Method(){
		//this.test1=10;-> 클래스 내부에서도 인스턴스와 static은 혼용할 수 없다.
		//this.Test1();
		Static_Test Test1 = new Static_Test(); //static 안에서 인스턴스를 사용하려면 이렇게 객체를 생성해야 사용할 수 있다.
		Test1.test1=5; // 이렇게 해야 가능.
		test2=0;
		Test2();
	}
		
	}


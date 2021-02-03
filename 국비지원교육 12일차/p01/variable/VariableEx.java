package p01.variable;
//메모리 = RAM + ROM 근데 자바에서 편하게 하려고 메모리를 RAM이라고 부름

//CPU(Cache)                                                 - RAM(메모리)                       - SSD/HDD(하드디스크는 옛날거임) (여기에 다 놔뒀다가 필요한 것만 -> RAM으로 옮겨서 대기시킨다.)
// 처리한 결과를 cache에 잠시 저장했다가 RAM으로 옮겨줌            Process(cpu에서 처리하기 위한 대기 프로그램)
//                                                  static 은 RAM에 있음.(바로바로 CPU 에서 쓸 수 있음)
//                                                     필요한것만 RAM에 갖다 놓겠다.(객체 생성)
//                                             만약 RAM 이 무한대로 크다면? 객체생성을 할 필요가 없게됨. 죄다 static 선언하면 되니까.
//우리가 이렇게 코드를 입력하고 저장하면 SSD에 저장이되고 입려되는건 RAM에 저장 실행버튼을 누르면 -> CPU Cashe 안으로 들어감 , CPU 가기전에 머물러 있는곳 RAM
//인스턴스 + static 합친 변수를 -> 멤버변수라고함
//Class: 틀(벽돌 공장에 틀) 
public class VariableEx {
	// 1.변수 =field

	// modifier dataType variable(Primitive 변수)
	// static 변수: static 제어자가 있는 변수, 객체생성(x)
	// a:실제값이 들어있다.-> 0
	// 전역변수(클래스 변수): 클래스 안에 있고 메소드 밖에 있는변수, 초기화 불필요
	static int a;// RAM에 어딧는지는 모르겠지만 올라가있음. 데이터 타입은 RAM 안에 들어갈 변수를 한정해준다.
	// instance 변수 -> static 없는 변수, 반드시 객체 생성
	double c; // Double class -> RAM에 없음.
	// 객체 생성이란 해당 데이터 타입의 클래스 전체를 RAM에 복사하고 그것을 가리킨다는 말임.

	// 2.메소드
	// main 메소드: 프로그램의 시작
	public static void main(String[] args) { // ma ctrl space 누르면 메인 메소드를 만들 수 있음.
		int b = 0; // 지역변수(local변수): 매소드 안에 있는 변수 -> 반드시 초기화를 해줘야함
		System.out.println("a: " + a); // console창 출력
		System.out.println("b: " + b); // console창 출력 --> ctrl + alt 화살표 밑으로

		// dataType variable(Reference 참조변수)
		// VA: 주소값이 들어있다. -> 주소값출력
		VariableEx va = new VariableEx(); // -> 객체 생성 (RAM에 있음) CPU 에서 언제나 사용가능.
		// RAM(객체 생성을 했기 때문에)에 있는 va는 VariableEX
		// VariableEX class 전체가 RAM에 올라가 있고 va가 이를 가르키고있다.

		char ch = 'a';
		String str = "abcd";

		System.out.println("c: " + va.c);// 전역변수에 있는 값을 초기화 하려면 Variable 객체를 만들어주고 그 필드를 쓰면 된다.
		System.out.println("str: " + str.charAt(0)); // str 에서 0번째에 있는놈을 빼내겠다.
		System.out.println("참조변수Va:" + va.toString()); // va의 주소값 출력-> p01.variable.VariableEx@15db9742
		// 모든것의 부모임 object 의 매소드를 쓰고 있는것임.

		va.abc();
		// System.out.println(va.abc()); // sout가 수행되었으므로 에러

	}

	// 메소드
	// 1.static이 없는 매소드 -> 인스턴스 매소드
	// 2.static이 있는 매소드 -> static 매소드
	void abc() { // ctrl shift 누르면 이쁘게 변함 --> 메소드

		System.out.println("Instance()");
	}

	// 3.생성자

	// 4.초기화 블럭

}

//모든 class 의 부모는 object 
//object 클래스에 모든게 다 들어있음.

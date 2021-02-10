package p08.abstractclass;
//Abstract Class : 추상 메소드가 있는 클래스, 반드시 class 앞에 "abstract"를 붙인다.
//사용하는 이유: 강제성, 일관성 (프로젝트할때 대략적인 이런거 이런거 하겠다. 하면서 정해줄때 필요)
//객체생성 불가 => 자식 객체를 만들어서 사용 ->몸통이 없기 때문에.(추상 메소드는 반드시 재정의)
//추상 클래스 때문에 "미완성 설계도" 인터페이스는-> 밑그림만 그려져있는 설계도 (더 불안정함)
//추상클래스의 사촌은 interface
public abstract class MyClass {
	
	int num=3;
	public MyClass() {
	
	}
	
	public void methodA(){
		System.out.println("methodA");
	}
	
	{
		System.out.println("Instance 초기화 블럭");
	}
	
	static {
		System.out.println("Static 초기화 블럭");
	}
	
	//5.추상메소드: 선언부만 있고, body가 없는 메소드
    //추상메소드는 클래스안에서 반드시 "abstract"라고 명시해야함
	abstract void methodB();// -> 추상 메소드

}

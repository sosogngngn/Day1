package p09.interfaces;
//인터페이스에서는 일반변수는 못씀. static final이 생략되어있어서 일반 변수 처럼 보이는 것임.
//interface : "밑그림만 그려진 설계도"
//          : 강제성,일관성
//          : 객체생성 불가 => 자식 클래스를 구현(상속)
//          : 다중상속이 가능.
//          : 익명(Anonymous) 구현 객체
//          : 추상 메소드에서 "abstract" 생략 가능

public interface Demo {
	
	//~Java7: 1,2번만 가능 
	//Java8~ : 1,2,3,4 모두 가능:옜날 프로그램들을 유지보수 하기위해  3,4번이 추가됐다(유지보수할 방법을 찾다가 3,4번의 방법을 찾게된것임)
	
	//1.상수를 쓸수 있다.
	public static final double PI = 3.14159;
	public int A = 10; //static final이 생략된것임.
	
	//2.추상메소드
	public void print(); //interface에선 abstract를 생략한다.(써도 되긴함)
	
	//3.default() : 재정의 가능
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음처리");
		else
		System.out.println("무음해제");
		System.out.println("종료");
	}
	
	//4.static()
	static void changeBattery() {
		System.out.println("건전지 교환");
	}

}

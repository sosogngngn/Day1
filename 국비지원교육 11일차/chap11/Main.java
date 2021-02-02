package chap11;

public class Main {

	public static void main(String[] args) {
		A a = new A(); //class A 객체를 선언해줘야 class B,C,D 를 사용할수 있다.
		               //class A 객체 미선언시 중첩클래스들 사용 x
		               //A객체가 생성됨 출력
		
		
		//인스턴스 멤버 클래스 생성
		A.B b = a.new B(); //class A 안에 B객체 생성
		//B객체가 생성됨 출력
		//a.new B(); -> 이게 A안에 B 객체를 생성해준 것임.
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 생성
		A.C c = new A.C(); //class A 안에 C객체 생성
		//C객체가 생성됨
		//static 이기때문에 A클레스에 있는 것을 직접 사용할 수 있다. 그러므로 A객체를 생성할 필요가
		//없다.
		//A객체를 생성하지 않아도 C객체는 생성해줘야하기떄문에 저렇게 C객체를 생성해준 것임.
		c.field1 = 3; 
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//local 클래스 객체 생성을 위한 메소드 호출
		a.method();//D객체가 생성됨 메소드 안에서 D객체를 생성했기때문임
		

	}

}

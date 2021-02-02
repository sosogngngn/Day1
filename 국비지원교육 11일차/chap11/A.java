package chap11;

class A {
	A() { System.out.println("A객체가 생성됨"); } //생성되는 순간 System.out.println 이 출력됨.
	
	//인스턴스 맴버 클래스
	class B{
		B() {System.out.println("B객체가 생성됨");}
		int field1;
		void method1() { }
	}
	
	//static 멤버 클래스
	static class C{
		C() {System.out.println("C객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {};
		static void method2() {}
	}
	
	void method() {
		//로컬 클래스 -> 매서드 안에 만든 클래스 : 매서드가 실행될떄만 실행됨.
		class D{
			D(){System.out.println("D객체가 생성됨");}
			int field1;
			void method1() {}
		}   //매서드가 실행될때만 객체를 생성하고 필드를 선언하고 호출할 수 있음을 보여줌.
			D d = new D();
			d.field1 = 3;
			d.method1();
	}
}

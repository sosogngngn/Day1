package p08.abstractclass;

public class Abstract_Main {

	public static void main(String[] args) {
		// 1.Old
		MyclassImpl imp = new MyclassImpl();// 부모 Myclass 객체도 자동생성
		System.out.println(imp.num);
		imp.methodA();
		imp.methodB();// 부모 추상메소드 오버라이드
		imp.print();

		System.out.println();

		// 2.Polymorphism
		MyClass imp2 = new MyclassImpl();// 부모의 눈으로 자식을 보고 있음. 자식만 갖고있는것은 안보임
	    System.out.println(imp.num);
		imp2.methodA();
		imp2.methodB();// 부모 추상메소드 오버라이드
		((MyclassImpl) imp2).print(); // -> 잘 안쓰는방법

		// 3.Polymorphism
		MyClass imp3 = new MyclassImpl();// 부모의 눈으로 자식을 보고 있음. 자식만 갖고있는것은 안보임
		MyclassImpl mi = (MyclassImpl)imp3; //
		System.out.println(imp.num);
		mi.methodA();
		mi.methodB();// 부모 추상메소드 오버라이드
		mi.print(); 
		
		
		// 4.Anonymous(익명) 추상클래스 (익명 추상클래스) ->객체생성을 안하는 것임
		//Anonymous : (myClassImpl)객체생성 이름 생략, 메소드만 존재
		MyClass imp4 = new MyClass() { //객체생성한거 아님 알맹이에 들어있는 내용을 표시해준 것
			
			@Override
			void methodB() {
				System.out.println("Anonymous Abstract class");
				
			}
		};
		System.out.println(imp4.num);
		imp4.methodA();
		imp4.methodB();//myClassImpl 객체를 생성안함. 근데 위와같이 익명 객체를 생성하면 void methodB() 부분을 말하는 것.
		//((MyclassImpl) imp4).print(); ->쓸 수없다.  myClassImpl의 이름을 쓴 곳이 없다.
		//그래서 못쓰는거임

	}

}

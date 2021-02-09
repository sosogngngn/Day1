package p05.inherit;

public class Child extends Parent{
	int c1 =20;
	void childMethod() {
		System.out.println("Child Method");
	}
	
	void parentMethod() {
		System.out.println("재정의된 parentMethod 입니다.");
	}
}

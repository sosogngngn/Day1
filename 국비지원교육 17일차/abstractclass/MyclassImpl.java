package p08.abstractclass;

public class MyclassImpl extends MyClass {

	
	
	@Override
	void methodB() {//부모의 추상메소드에서는 몸통이 없으므로 반드시 오버라이드 해서 사용한다.
		System.out.println("methodB - Overriding");

	}
	
	public void print() {
		System.out.println(num);
	}

}

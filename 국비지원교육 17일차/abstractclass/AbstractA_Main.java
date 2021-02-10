package p08.abstractclass;

public class AbstractA_Main {

	public static void main(String[] args) {
		AbstractAAA a1 = new AbstractAAA();
		a1.methodA();
		a1.methodB();
		a1.methodC();
		
		AbstractAA a2 = new AbstractAAA();
		a2.methodA();
		a2.methodB();
		((AbstractAAA)a2).methodC();
		
		AbstractA a3 = new AbstractAAA();
		a3.methodA();
		((AbstractAAA)a3).methodB(); //AA로 해줄필요없음 자식이 생성되면 부모 객체가 생성되니까
		((AbstractAAA)a3).methodC();

	}

}

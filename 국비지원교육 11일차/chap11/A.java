package chap11;

class A {
	A() { System.out.println("A��ü�� ������"); } //�����Ǵ� ���� System.out.println �� ��µ�.
	
	//�ν��Ͻ� �ɹ� Ŭ����
	class B{
		B() {System.out.println("B��ü�� ������");}
		int field1;
		void method1() { }
	}
	
	//static ��� Ŭ����
	static class C{
		C() {System.out.println("C��ü�� ������");}
		int field1;
		static int field2;
		void method1() {};
		static void method2() {}
	}
	
	void method() {
		//���� Ŭ���� -> �ż��� �ȿ� ���� Ŭ���� : �ż��尡 ����ɋ��� �����.
		class D{
			D(){System.out.println("D��ü�� ������");}
			int field1;
			void method1() {}
		}   //�ż��尡 ����ɶ��� ��ü�� �����ϰ� �ʵ带 �����ϰ� ȣ���� �� ������ ������.
			D d = new D();
			d.field1 = 3;
			d.method1();
	}
}

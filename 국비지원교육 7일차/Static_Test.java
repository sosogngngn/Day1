package chap07;

public class Static_Test {
	int test1;
	void Test1 () {
  		
	}

	
	static int test2;
	static void Test2() {
		
	}
	//���� ���
	static {
		//test1=10;//this.a = 10; -> ������ ���� : �����ڷ� �ʱ�ȭ �ؾ���. static ���������� �ν��Ͻ��� �ʱ�ȭ�� �� ����.: main ���� new�� ����
		test2=0; //-> static ���� ����� ���̶� �ʱ�ȭ ���� -> main���� �ν��Ͻ�(��ü) ���� x
		//Test1();//static ���������� ��ü�� �������� �ʱ� ������ ������ ����
		Test2();	
	}
	
	static void Method(){
		//this.test1=10;-> Ŭ���� ���ο����� �ν��Ͻ��� static�� ȥ���� �� ����.
		//this.Test1();
		Static_Test Test1 = new Static_Test(); //static �ȿ��� �ν��Ͻ��� ����Ϸ��� �̷��� ��ü�� �����ؾ� ����� �� �ִ�.
		Test1.test1=5; // �̷��� �ؾ� ����.
		test2=0;
		Test2();
	}
		
	}


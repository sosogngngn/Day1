package chap07;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static int value;
	static int x;
	static int y;
	//�ν��Ͻ��� �����ڷ� �ʱ�ȭ�� ������
	//static �� static �̷� Ư���� �޼ҵ带 Ȱ���� �ʱ�ȭ�� �Ѵ�.
	static {
		info= company + "-" + model;
		x=10; y=10;
		value = x+y;
		//���������� ����ȴ�.
	}
	

	
}

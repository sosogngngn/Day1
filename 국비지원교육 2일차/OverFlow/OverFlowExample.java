package OverFlow;

public class OverFlowExample {

	public static void main(String[] args) {
		/*
		 * int x = 1000000; 
		 * int y = 1000000;
		 * int z=x*y;  //-> overflow�� int�� ������ ��  -40��~40�� �����δ� �̹����� �Ѿ��� ������\
		 * �ƹ��͵� �ƴ� -727379968 �����Ⱚ�� ���Ե� 
		 * �̸� �ذ��Ϸ��� x�� y ���߿� �ϳ��� longŸ������ �������ְų� z�� long���� �����������.
		 * System.out.println(z);
		 */
	
	
		long x = 1000000;
		long y = 1000000;		
		long z = x*y;
		System.out.println(z);
		

	}

}
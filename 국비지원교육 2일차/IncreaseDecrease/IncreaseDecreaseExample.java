package IncreaseDecrease;

public class IncreaseDecreaseExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------------");
		x++; //-> x =11
		System.out.println("x="+x);//11���
		++x; //-> x =12
		System.out.println("x="+x); //12��� 
		
		System.out.println("--------------------------");
		y--;// -> y=9
		System.out.println("y="+y);//9���
		--y;// -> y=8
		System.out.println("y="+y);//8���
		
		System.out.println("--------------------------");
		z=x++; //z=12�����ϰ��� +1�� �� , 
		System.out.println("z="+z);//z=12(z�� ���Խ�Ű�� ���� x�� �����ϴ� ���̶� z=12)->x=13
		System.out.println("x="+x);//x=13
		
		System.out.println("--------------------------");
		z=x++;//z=13
		System.out.println("z="+z);//z�� �����ϱ� �� 13�� ���� �� x 1 ���� x=14
		System.out.println("x="+x);//x=14
		
		System.out.println("--------------------------");
		z=++x + y++ ;//x�� ���� ���� �� x=15,y=8 -> 15+8=23�� z�� ������ �Ŀ� y=9
		System.out.println("z="+z);//z=23 (15 + 8)
		System.out.println("x="+x);//x=15
		System.out.println("y="+y);//y=9	
		}
}

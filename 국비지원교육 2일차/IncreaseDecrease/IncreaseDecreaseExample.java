package IncreaseDecrease;

public class IncreaseDecreaseExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------------");
		x++; //-> x =11
		System.out.println("x="+x);//11출력
		++x; //-> x =12
		System.out.println("x="+x); //12출력 
		
		System.out.println("--------------------------");
		y--;// -> y=9
		System.out.println("y="+y);//9출력
		--y;// -> y=8
		System.out.println("y="+y);//8출력
		
		System.out.println("--------------------------");
		z=x++; //z=12대입하고나서 +1이 됨 , 
		System.out.println("z="+z);//z=12(z에 대입시키고 나서 x가 증가하는 것이라 z=12)->x=13
		System.out.println("x="+x);//x=13
		
		System.out.println("--------------------------");
		z=x++;//z=13
		System.out.println("z="+z);//z에 증가하기 전 13을 저장 후 x 1 증가 x=14
		System.out.println("x="+x);//x=14
		
		System.out.println("--------------------------");
		z=++x + y++ ;//x는 먼저 증가 후 x=15,y=8 -> 15+8=23을 z에 대입한 후에 y=9
		System.out.println("z="+z);//z=23 (15 + 8)
		System.out.println("x="+x);//x=15
		System.out.println("y="+y);//y=9	
		}
}

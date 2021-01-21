package OverFlow;

public class OverFlowExample {

	public static void main(String[] args) {
		/*
		 * int x = 1000000; 
		 * int y = 1000000;
		 * int z=x*y;  //-> overflow임 int의 범위는 약  -40억~40억 까지인대 이범위를 넘었기 때문에\
		 * 아무것도 아닌 -727379968 쓰레기값을 갖게됨 
		 * 이를 해결하려면 x나 y 둘중에 하나를 long타입으로 선언해주거나 z를 long으로 선언해줘야함.
		 * System.out.println(z);
		 */
	
	
		long x = 1000000;
		long y = 1000000;		
		long z = x*y;
		System.out.println(z);
		

	}

}
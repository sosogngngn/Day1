package chap07;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static int value;
	static int x;
	static int y;
	//인스턴스는 생성자로 초기화를 하지만
	//static 은 static 이런 특별한 메소드를 활용해 초기화를 한다.
	static {
		info= company + "-" + model;
		x=10; y=10;
		value = x+y;
		//순차적으로 실행된다.
	}
	

	
}

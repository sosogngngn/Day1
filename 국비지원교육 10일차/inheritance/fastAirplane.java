package inheritance;

public class fastAirplane extends Airplane {
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	public void fly() {
		if(flyMode==SUPERSONIC)
		System.out.println("�ʰ�� �����մϴ�.");
	
	   else {
		super.fly();
	}
	

	}
}

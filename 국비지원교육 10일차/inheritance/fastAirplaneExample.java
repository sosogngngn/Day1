package inheritance;

public class fastAirplaneExample {

	public static void main(String[] args) {
	
		fastAirplane plane = new fastAirplane();
		
		plane.land();
		plane.fly();//�׳� ���
		
		plane.flyMode=fastAirplane.SUPERSONIC; //���� �ٲٰ� ���
		plane.fly();
		
		plane.flyMode=fastAirplane.NORMAL;
		plane.fly();
		
		plane.land();

	}
0
}

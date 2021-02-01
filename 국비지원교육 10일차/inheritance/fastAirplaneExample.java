package inheritance;

public class fastAirplaneExample {

	public static void main(String[] args) {
	
		fastAirplane plane = new fastAirplane();
		
		plane.land();
		plane.fly();//그냥 출력
		
		plane.flyMode=fastAirplane.SUPERSONIC; //변수 바꾸고 출력
		plane.fly();
		
		plane.flyMode=fastAirplane.NORMAL;
		plane.fly();
		
		plane.land();

	}
0
}

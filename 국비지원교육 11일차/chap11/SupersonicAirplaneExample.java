package chap11;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		supersonicAirplane plane = new supersonicAirplane();
		
		plane.land();
		plane.flymode = plane.SUPERSONIC;
		plane.flymode();
		plane.flymode = plane.NOMAL;
		plane.flymode();
		plane.takeoff();

	}

}

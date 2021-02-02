package chap11;

public class supersonicAirplane extends Airplane {
	static final int SUPERSONIC = 2;
	static final int NOMAL = 1;
	int flymode;
	public void flymode() {
		if(flymode == SUPERSONIC) {
			System.out.println("초음속 비행 합니다.");
		}
		else {
			System.out.println("일반비행합니다.");
		}
	}

}

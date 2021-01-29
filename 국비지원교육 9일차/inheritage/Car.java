package inheritage;

public class Car {
	Tire frontleftTire = new Tire("앞 왼쪽",6);
	Tire frontRightTire = new Tire("앞 오른쪽",2);
	Tire backleft = new Tire("뒤 왼쪽",3);
	Tire backRight = new Tire("뒤 오른쪽",4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontleftTire.roll()==false) {
			stop(); return 1;
		}
		
		if(frontRightTire.roll()==false) {
			stop(); return 2;
		}
		if(backleft.roll()==false) {
			stop(); return 3;
		}
		if(backRight.roll()==false) {
			stop(); return 4;
		}
		return 0;
	}
	
	void stop(){
		System.out.println("[자동차가 멈춥니다.]");
	}

}

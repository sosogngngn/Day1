package inheritage;

public class Car {
	Tire frontleftTire = new Tire("�� ����",6);
	Tire frontRightTire = new Tire("�� ������",2);
	Tire backleft = new Tire("�� ����",3);
	Tire backRight = new Tire("�� ������",4);
	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
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
		System.out.println("[�ڵ����� ����ϴ�.]");
	}

}

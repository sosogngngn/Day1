package chap11;

public class supersonicAirplane extends Airplane {
	static final int SUPERSONIC = 2;
	static final int NOMAL = 1;
	int flymode;
	public void flymode() {
		if(flymode == SUPERSONIC) {
			System.out.println("������ ���� �մϴ�.");
		}
		else {
			System.out.println("�Ϲݺ����մϴ�.");
		}
	}

}

package inheritage;

public class carExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		
		
		for(int i = 1; i<=5 ; i++) {
			int problemLocation = car.run();

		switch(problemLocation) {
		case 1 :
			System.out.println("�� ���� HanKookTire�� ��ü");
			car.frontleftTire = new HankookTire("�� ����", 15);
			break;
		case 2 : 
			System.out.println("�� ������ KumhoTir�� ��ü");
			car.frontRightTire= new KumhoTire("�� ������", 13);
			break;
		case 3 :
			System.out.println("�� ���� HanKookTire�� ��ü");
			car.backleft=new HankookTire("�� ����", 14);
			break;
		case 4 :
			System.out.println("�� ������ KumhoTire");
			car.backRight=new KumhoTire("�� ����", 14);
			break;
	
		}
		System.out.println("----------------------------");
		System.out.println();
	

	}

}
}

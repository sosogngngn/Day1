package inheritage;

public class carExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		
		
		for(int i = 1; i<=5 ; i++) {
			int problemLocation = car.run();

		switch(problemLocation) {
		case 1 :
			System.out.println("앞 왼쪽 HanKookTire로 교체");
			car.frontleftTire = new HankookTire("앞 왼쪽", 15);
			break;
		case 2 : 
			System.out.println("앞 오른쪽 KumhoTir로 교체");
			car.frontRightTire= new KumhoTire("앞 오른쪽", 13);
			break;
		case 3 :
			System.out.println("뒤 왼쪽 HanKookTire로 교체");
			car.backleft=new HankookTire("뒤 왼쪽", 14);
			break;
		case 4 :
			System.out.println("뒤 오른쪽 KumhoTire");
			car.backRight=new KumhoTire("뒤 왼쪽", 14);
			break;
	
		}
		System.out.println("----------------------------");
		System.out.println();
	

	}

}
}

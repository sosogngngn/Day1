package study01;

public class AirConUse2 {

	public static void main(String[] args) {
		Aircon airCon1 = new Aircon();
		airCon1.color = "White";
		airCon1.temp = 10;
		airCon1.price = 10000;
		
		//메소드 사용
		airCon1.tempUp();//temp =11
		System.out.println("airCon1.temp = " + airCon1.temp + ", airCon1.color = " + airCon1.color
				+ ", airCon1.price = " + airCon1.price + "원 ");
		airCon1.powerOn();
		airCon1.powerOff();
		airCon1.tempDown();//temp=10
		System.out.println("airCon1.temp = " + airCon1.temp + ", airCon1.color = " + airCon1.color
				+ ", airCon1.price = " + airCon1.price + "원 ");
		
		//두 번쨰 객체 생성
		Aircon airCon2 = new Aircon(); // Aircon 클래스에 temp값이 초기화 안돼있어 기본값인 0으로 설정돼서 temp =0
		System.out.println("airCon2.temp = " + airCon2.temp + ", airCon2.color = " + airCon2.color
				+ ", airCon2.price = " + airCon2.price + "원 ");

		airCon2=airCon1; //airCon2 주소에 airCon1의 주소를 대입해 현재 airCon1 가르키는 곳을 참조한다. 그러므로 temp=10 
		System.out.println("airCon2.temp = " + airCon2.temp + ", airCon2.color = " + airCon2.color
				+ ", airCon2.price = " + airCon2.price + "원 ");

		

	}

}

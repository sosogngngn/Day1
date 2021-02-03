package study01;

public class AirConUse {

	public static void main(String[] args) {
		Aircon airCon = new Aircon();
		
		airCon.color = "white";
		airCon.temp = 10;
		airCon.price=10000;
		
		airCon.tempUp();
		System.out.println("airCon.temp = "+airCon.temp+ "airCon.color = "+ airCon.color+"," +"airCon.pric = " + airCon.price + "원" );

		airCon.powerOn();
		airCon.powerOff();
		airCon.tempDown();
		System.out.println("airCon.temp = " + airCon.temp + ", airCon.color = " + airCon.color
				+ ", airCon.price = " + airCon.price + "원 ");


	}

}

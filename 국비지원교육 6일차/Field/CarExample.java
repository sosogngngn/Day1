package Field;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		System.out.println("제작회사: " + mycar.company);
		System.out.println("모델명: " +mycar.model);
		System.out.println("색깔: " + mycar.color);
		System.out.println();
		
		mycar.speed =60;
		System.out.println("수정된 속도: "+ mycar.speed);

	}

}

package Field;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		System.out.println("����ȸ��: " + mycar.company);
		System.out.println("�𵨸�: " +mycar.model);
		System.out.println("����: " + mycar.color);
		System.out.println();
		
		mycar.speed =60;
		System.out.println("������ �ӵ�: "+ mycar.speed);

	}

}

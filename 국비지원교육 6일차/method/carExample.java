package method;

public class carExample {

	public static void main(String[] args) {
		
		car myCar = new car();
		
		myCar.Setgas(5); // Car�� setGas �޼ҵ� ȣ��
		
		boolean gasState= myCar.isLeftGs(); 
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		
		if(myCar.isLeftGs()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}
		else {
			System.out.println("gas�� �����ϼ���.");
		}
		
	}
}

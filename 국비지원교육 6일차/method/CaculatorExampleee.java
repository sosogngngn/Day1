package method;

public class CaculatorExampleee {

	public static void main(String[] args) {
		CaculatorPractice myCal = new CaculatorPractice();
		
		myCal.poweron();
		
		int result1 =  myCal.plus(45, 23);
		System.out.println("result1: " + result1);
		
		double result2 = myCal.divide(5,5);
		System.out.println("result2: " + result2);		

		myCal.poweroff();
	}

}

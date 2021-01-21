package OverFlow;

public class CheckOverflowExample {

	public static void main(String[] args) {
		try {
			int result = safeAdd(999999999 , 999999999);
			System.out.println(result);
		}  catch(ArithmeticException e) {
				System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
			
			}
		}
	
	 public static int safeAdd(int left, int right) {
		 if((right>0)) {
			 if(left+right>(Integer.MAX_VALUE)) {
				 throw new ArithmeticException("�����÷ο� �߻�");
			 }
		 } else {
			 if(left+right<(Integer.MIN_VALUE)) {
				 throw new ArithmeticException("�����÷ο� �߻�");
			 }
		 }
			
		return left + right;
	}

}




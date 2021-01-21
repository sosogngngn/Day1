package OverFlow;

public class CheckOverflowExample {

	public static void main(String[] args) {
		try {
			int result = safeAdd(999999999 , 999999999);
			System.out.println(result);
		}  catch(ArithmeticException e) {
				System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
			
			}
		}
	
	 public static int safeAdd(int left, int right) {
		 if((right>0)) {
			 if(left+right>(Integer.MAX_VALUE)) {
				 throw new ArithmeticException("오버플로우 발생");
			 }
		 } else {
			 if(left+right<(Integer.MIN_VALUE)) {
				 throw new ArithmeticException("오버플로우 발생");
			 }
		 }
			
		return left + right;
	}

}




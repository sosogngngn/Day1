package ArithmeticOperator;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면,");
		System.out.println(result + "조각이 남는다.");//0.2999999999999가 나옴
       //정확히 0.3이 나오지 않는다. 근사치로 나오게 됨
	   //0.3이 나오게 하려면?
	}

}

/*0.3 딱 나오는 연산
package ArithmeticOperator;

public class AccuracyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple*10;
		int number = 7;
		int temp = totalPieces - number
		
		double result = temp/10.0;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면,");
		System.out.println(result + "조각이 남는다.");//0.3이 나옴
		
		//연산마다 차이가 발생.
	    //이진 포맷의 가수를 사용하는 부동소수점 타입(float, double)은 0.1을 정확히 표현할 
	    //수 없어 근사치로 처리하기 때문에
	    //부동소수점 타입은 무조건 써야되는 경우 아니고선 피하는게 좋다.
	     
	     */
		
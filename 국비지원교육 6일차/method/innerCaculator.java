package method;

public class innerCaculator {
	
	int plus(int x, int y) {
		int sum = x+y;
		return sum;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		print("실행결과:" + result);
	}
	
	void print(String message) {
		System.out.println(message);	
	}
}

package method;

public class Caculator {  //CaculatorMethod
	
	void poweron(){
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(double q, double w) {
		double result = (double)q/(double)w;
		
		return result;
	}
	
	void poweroff() {
		System.out.println("전원을 끕니다.");	
	}
}


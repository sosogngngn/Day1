package method;

public class car {
	int gas; //전역변수
	
	void Setgas(int gas) {
		this.gas = gas;  //외부로부터 gas를 입력받아서 필드값을 바꿈		
	}
	
	boolean isLeftGs() {
		if(gas==0) {
			System.out.println("가스가 없습니다.");
			return false;
		}
		else{System.out.println("gas가 있습니다.");
		return true;
	}
}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.");
				gas-=1;
			}
			else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return;//메소드 실행 종료
			}
		}
	}

}

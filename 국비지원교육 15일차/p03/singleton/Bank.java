package p03.singleton;
//외부에서 불러낼 수 있는 것은 public 으로 되어있는 것만 가능하다. getName, getBank만 외부에서 접근 가능.
public class Bank {   //참조 변수 b는 이 클래스 안에서만 호출이가능하다. ->싱글톤
	private String name;

	private static Bank b = new Bank("KB은행"); //b에는 class Bank의 주소값을 갖고있음.
    //class를 시작하자마자 KB은행을 저장해놓고 사용하겠다는 것임.
	//static 참조변수 b 는 항상 메모리에 올려놓겠다.
	//private 이클래스 안에서만 쓰겠다.
	//참조 b는 외부에서 접근불가. 이 클래스 안에서만 사용 가능
	
	public static Bank getBank() { //외부에서 접근할때 getBank를 통해서만 접근이 가능.
		return b;
		
	}
	public String getName() {
		return name;
	}


	private Bank(String name) {
		// super();//부모 생성자 호출
		// super -> 부모클래스
		this.name = name;
		// this();
	}

}

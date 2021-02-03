package p01.variable;

public class VariableEx3_sub {
   //클래스 안에 구성원으로 돼있는 변수 이름은 멤버 변수
	
	//Constructor: 클래스 이름과 동일, 반환형 타입이 없음.
	
	//Constructor overloading :생성자가 여러개 존재하는 것(파라미터의 타입의 순서, 갯수가 각각 다른 형태)
	//기본 생성자: parameter가 없는 생성자
	public VariableEx3_sub(){ 
	
	}
	//parameter가 있는 생성자가 나중에 만들어 지면 기본생성자는 지금까지 내부적으로 자동생성되었지만, 수동으로
	//작성해야한다.
	public VariableEx3_sub(int i, String string) {
		System.out.println(i+string);
	}
	//타입과 갯수가 같으므로 생성자 overloading이 될수 없음.
//	public VariableEx3_sub(int a, String str) {
//		System.out.println(i+string);
//	}
	//이건 오버라이딩 가능
//	public VariableEx3_sub(int i, double k) {
//		System.out.println(i+string);
//	}
	
	int a=10;
	
	int sub() {	
		int result =10;
		return result;
	}
	//오버로딩 1.생성자 오버로딩 2.매소드 오버로딩
	//재정의: 부모클래스 내용을 자식 클래스에서 재정의(수정) 하는 것.
	@Override  //부모의 toString 매소드를 자식(VariableEx3_sub)에서 수정하는 것
    public String toString() { 
    	
		return "홍길동";
    }
	
}

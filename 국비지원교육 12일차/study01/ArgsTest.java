package study01;

class Args {
	int x;
	
	void add(int x) {
		x=x+50;
	}
	
	void add(Args arg) { //Args 타입으로 arg 변수를 선언하고 parameter를 받겠다는 말은
		                 //Args 클래스에 있는 변수,메소드를 사용할 수 있다는 말.
		arg.x=arg.x +40;
	}
	
	void addNew(Args arg) {
		arg = new Args(); // Args 객체를 arg에 대입?
	}
	void add(int[] arr) {//배열을 parameter로 받겠다.
		arr[0]++;
	}

}

public class ArgsTest{
	
	public static void main(String[] args) {
		Args arg = new Args();
		
		arg.x = 100; //class Args에 int x 값을 100으로 초기화
		int[] arr = {0};
		
		arg.add(arg.x);//arg.x = 100 이므로 add(100) ->class Args에서 add(int x)에 100대입해서 150아닌가 
		System.out.println("arg.x = "+ arg.x);//class Args에 int x 값을 100으로 초기화 했으니 arg.x는 100
		
		arg.add(arg);//이 arg는 뭐하는놈이야!?
		System.out.println("arg.x = "+ arg.x);
		
		arg.addNew(arg);
		System.out.println("arg.x = "+ arg.x);
		
		arg.add(arr);
		System.out.println("arr[0] = " + arr[0]);
		
		
		
	}
}

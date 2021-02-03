package p01.variable;

public class VariableEx3 {
	//int a1 = 10,20,30,40
	int[] a2= {10,20,30,40};//배열

	//기본생성자
	public VariableEx3() {
		System.out.println("기본생성자");
	}
	
	public static void main(String[] args) {
		VariableEx3 v3 = new VariableEx3();
		
		VariableEx3_sub vs= new VariableEx3_sub();// 기본생성자가 있어야 빨간줄이
		                                          //없어짐
		System.out.println(vs.a);
		System.out.println(vs.sub());
		System.out.println("vs:"+vs);//주소값 출력=> "홍길동"출력
		System.out.println("vs:"+vs.toString());//주소값 출력=> "홍길동"출력
		
		VariableEx3_sub vs2= new VariableEx3_sub(2,"홍길동");
		System.out.println(vs2.a);
		System.out.println(vs2.sub());
		
	}

}

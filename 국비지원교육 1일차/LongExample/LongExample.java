package LongExample;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; //컴파일 에러
        long var4 =100000000000L ; //int를 넘어가는 숫자는 반드시 L을 붙여줘야함 Long 타입은 뒤에 L 붙인다 생각하면 편하다
	
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
	}

}
//var3가 에러가 나는 이유는 int를 초과했기 때문이다 결국 int로 변환해서 처리한다고 아까 말했듯이
//int 넘어가는 숫자는 자료형 long 으로 선언해줬어도 숫자끝에 L표시가 없으면 int로 처리하려고 함.
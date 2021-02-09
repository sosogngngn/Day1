package p03.singleton;
//객체 생성을 단 한번만 하겠다.
//why? 메모리 절약하기 위해서
public class Bank_Main {

	public static void main(String[] args) {
       //Singleton 사용 이전
	   //똑같은 내용임에도 불구하고 객체를 2번 만듬
//		Bank b = new Bank("신한은행");
//		System.out.println(b.getName());
//		
//		Bank b2 = new Bank("신한은행");
//		System.out.println(b2.getName());
		
	  //singleton 사용 후
      //생성된 주소값을 불러다가 계속 쓰는 것임.
		Bank bb = Bank.getBank();
		System.out.println("Bank이름은"+ bb.getName());
	}

}

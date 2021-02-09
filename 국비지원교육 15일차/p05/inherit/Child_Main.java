package p05.inherit;
//자식의 객체가 생성되면 부모는 자동 생성.
public class Child_Main {

	public static void main(String[] args) {
		//1.Child Class: 변수나 메소드 출력
		Child c = new Child();
		System.out.println("Parent Class 변수="+c.p1);
        c.parentMethod();
		System.out.println("Child Class 변수="+c.c1);
        c.childMethod();
		
        
        //2.부모클래스의 변수나 메소드 재정의 출력
        Child cc = new Child();
        cc.p1=10;
        System.out.println(cc.p1);
        cc.parentMethod();
        System.out.println(cc.c1);
        cc.childMethod();
  
	}

}

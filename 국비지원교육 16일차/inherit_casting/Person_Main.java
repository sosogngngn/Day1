package p06.inherit_casting;
//교재 305page
//Casting(강제형변환): 상속관계에서만 가능
//자식이 부모로 자동형변환.
//부모가 자식으로 형변환하는 것은 강제형변환
//이때 상속관계가 아니면 강제형변환 성립 x
public class Person_Main {

	public static void main(String[] args) {
//1.Old 방법
		Person_child pc = new Person_child();
		System.out.println(pc.a);
		pc.method();
		System.out.println(pc.pc);
		pc.method_pc();
		
		
		Person_Child2 pc2 = new Person_Child2();
		
		//polyMorpnism 다형성 : 하나의 부모 객체로 여러 자식객체를 지칭하는 것.
		//                     전제조건: 상속

//2.new1 방법		
		Person p1; //부모 변수    // 선언 부모 변수 하나에
		p1= new Person_child(); // 자식 객체 1
		System.out.println(p1.a);//Person 지꺼니까 보임
		p1.method();             //이것도 지꺼니까 보임
		System.out.println(((Person_child) p1).pc);//자식거라 못씀(부모에서) Person이 부모 Person_child가 자식 
		((Person_child) p1).method_pc();//이것도 자식꺼라 안보임
		                          //그래서 하는게 형변환이다. p1 앞에 (Person_child)으로 강제 형변환 해준것임.
		                          //Class간의 형변환은 상속이 전제 되어야함
		                          //부모 -> 자식으로 강제 형변환 해야함.

		
//3.new2(권장) 방법 - 형변환이 간단해진다.(324page)
		Person_child pcs = (Person_child) p1; //이렇게 형변환 해놓고 쓰면 중복 줄임 위에랑 비교했을때보다 훨씬 깔끔함.
	    System.out.println(pcs.a);//Person 지꺼니까 보임
		pcs.method();             //이것도 지꺼니까 보임
		System.out.println(pcs.pc);//자식거라 못씀(부모에서) Person이 부모 Person_child가 자식 
		pcs.method_pc();//이것도 자식꺼라 안보임
	    
	    
	    
	    p1 = new Person_Child2(); // 자식 객체 2
		
	}

}

//하나의 부모에 여러 자식이 있을때 다형성을 많이 사용한다. 
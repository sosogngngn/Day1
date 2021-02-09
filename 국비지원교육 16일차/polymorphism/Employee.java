package p07.polymorphism;
//3)파라미터의 다형성
public class Employee {
	String name;
	int salary;
	
	public String getEmployee() {
		return name+" : "+salary;
	}      //왼쪽이 오른쪽으로 형변환 가능하냐?  왼쪽 instanceof 오른쪽
	//교재 321page      //Employee->//Parameter 다형성 -> 부모타입을 선언해 놓으면 2개의 자식인 Engineer, Manager 파라미터를 사용할 수 있음
	public void taxRate(Employee e) {//Employee 타입은 Engineer , Manger의 부모다.
		if(e instanceof Manger) { //형변환 가능 여부 //e를 따라갔더니 Manger 클래스냐?
			Manger m = (Manger)e; //강제 형변환
			System.out.println("Manager 세금구하기");
		} else if(e instanceof Engineer) {//e를 따라갔더니 Engineer 클래스냐?
			Engineer en = (Engineer)e ;
			System.out.println("Engineer 세금구하기");
		} else if(e instanceof Employee) {//e를 따라갔더니 Employ 클래스냐?
			System.out.println("employee 세금구하기");
	}
		
		
	//다형성이 없으면 이렇게 일일이 하나씩 다만들어줘야함. 위에처럼 한번에 작성 가능함.
//	public void taxRate(Manger e) {
//		if(e instanceof Manger) {
//		
//		}
//	}
//	
//	public void taxRate(Engineer e) {
//		if(e instanceof Engineer) {
//			
//		}
	}

}

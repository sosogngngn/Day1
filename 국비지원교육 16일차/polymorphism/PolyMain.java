package p07.polymorphism;
//[다형성 종류]
//1.클래스 변수의 다형성
//2.메소드의 다형성
//3.Parameter의 다형성
//4.Array(배열)의 다형성
//5.Abstract Class(추상클래스)의 다형성
//6.interface의 다형성

public class PolyMain {

	public static void main(String[] args) {
		//1. old
		Employee emp = new Employee();
		Manger man = new Manger();
		Engineer eng = new Engineer();
		//2)매소드의 다형성
		emp.taxRate(emp);
		man.taxRate(man);
		eng.taxRate(eng);
		
		//2.new1
		System.out.println("--------------------------");
		Employee e ; //1)클래스 변수의 다형성
		e=new Manger();
		e.taxRate(e);
		
		e=new Engineer();
		e.taxRate(e);
		
		//3.new2
		Employee e2 ;
		e2=new Manger();
		Manger m = (Manger)e2;
		m.taxRate(m);
		
	}

}

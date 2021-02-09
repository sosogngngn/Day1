package p07.polymorphism;
//PolyMorphism: 여러개의 개별적인 클래스를 하나의 부모 클래스 객체로 통합관리, 효율성 증대
//상속이 전제
//큰 타입(부모) = 작은 타입(자식) 자동형변환
//작은 타입(자식) = 큰 타입(부모) 강제형변환
//중복 제거, 재사용성을 위해서 사용
public class BaseBall_Main {

	public static void main(String[] args) {
		Game g1 = new Game();
		g1.type();
		//((object)g1).write(); //사용불가 
		
		//1.old -> 자식이 많을때는 불편함 계속 만들어야되니까
		BaseBall bs = new BaseBall();
		bs.type();
		bs.write();
		
		//2.new1
	    Game g2 = new BaseBall();//부모에 자식객체를 호출했을 때 자식것을 사용하지 못함 casting 해줘야함
	    g2.type();//부모의 눈에는 자기가 갖고 있는 것들은 보임
	    ((BaseBall) g2).write();//부모의 눈으로 자식 것은 안보임. 그래서 강제로 자식을 보는 눈(캐스팅)을 만들어준 것임.
		
	    //3.new2
	    Game g3 = new BaseBall(); //부모에 자식 객체 생성
	    BaseBall bs2= (BaseBall)g2;//부모가 보고있는게 자식(BaseBall) 이다.
	    bs2.type();
	    bs2.write();
	}

}

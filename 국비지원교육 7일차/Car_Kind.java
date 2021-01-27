package chap07;

public class Car_Kind {
	String name;
	int speed;

	Car_Kind(String name){
		this.name=name;
	}
	
	void Speed(int speed) { //여기 speed를 받는 매소드를 따로 만들어준 이유는
		                    //생성자는 외부로부터 매개변수를 받아오나 클래스 내부에서 값을 수정할 수 없다.
        this.speed=speed;   //-> 이 매소드를 실행하면 field에 speed 값이 저장된다.
	}
	
	void run() {
		for(int i=10 ; i<=50; i+=10) {
			Speed(i);
			System.out.println(this.name+"가 달립니다.(시속:"+this.speed+")km/h");
	
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

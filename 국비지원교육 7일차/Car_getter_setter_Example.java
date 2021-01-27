package chap07;

public class Car_getter_setter_Example {

	public static void main(String[] args) {
		Carg_getter_setter myCar = new Carg_getter_setter();
		myCar.setSpeed(-50); // 0보다 작으면 0으로 속도 초기화 0보다 크면
		                     //속도값 변경
		System.out.println("현재속도:"+ myCar.getSpeed()); //getspeed는 field에 있는 speed 값을 읽어옴.

		 //0보다 큰값
		myCar.setSpeed(60); 
	
		System.out.println("현재속도: "+ myCar.getSpeed());
         //-> 이거 왜 60 출력안되고 0 출력되는고? 		
		if(!myCar.isStop()) { //boolean 타입. stop 초기화가 안했으면
			                  //기본값으로 false를 가짐
			myCar.setStop(true);//속도 0으로 만들어주고 stop을 true로 변경(직접 변경x)
		}
	System.out.println("현재속도:"+myCar.getSpeed());
	}

}

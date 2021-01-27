package chap07;

public class Carg_getter_setter {

	private int speed;
	private boolean stop;
	
	int getSpeed() {
		return speed;
	}
	
	void setSpeed(int speed) {
		if(this.speed <0) {
			this.speed=0;
			return;
		}
		else {
			this.speed=speed;
		}
		
	}
	
	boolean isStop() {
		return stop;
	}
	
	void setStop(boolean stop) {
		this.stop=stop;
		this.speed=0;
		
	}
	
}

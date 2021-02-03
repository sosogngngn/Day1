package practice;

public class STatic {
	int speed;
	
    void run() {
		System.out.println(speed+"로 달립니다.");
	}
	
	public static void main(String[] args) {
		STatic Speed = new STatic();
		Speed.speed=10;
		Speed.run();
	}

}

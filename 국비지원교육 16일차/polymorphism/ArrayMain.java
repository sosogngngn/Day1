package p07.polymorphism;

//배열의 다형성
//하나의 부모의 눈으로 여러 자식을 바라보겠다.
public class ArrayMain {

	public static void main(String[] args) {
		ArrayMethod[] am = new ArrayMethod[2]; // 부모의 눈으로 배열을 구성함
		am[0] = new ArrayInheritA();
		am[1] = new ArrayInheritB();

		for (int i = 0; i < am.length; i++) {
			am[i].showSleepStyle();
		}
		
		for (ArrayMethod s : am) {
			s.showSleepStyle();
		}
	}

}

// 출력결과: showSleepStyle-A
// 출력결과: showSleepStyle-B

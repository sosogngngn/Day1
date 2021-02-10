package p09.interfaces;

public class Demo_Main {

	public static void main(String[] args) {

		// 1.일반
		DemoImpl d1 = new DemoImpl();
		System.out.println(d1.PI);
		System.out.println(d1.A);
		d1.print();
		d1.write();
		d1.setMute(true);
		Demo.changeBattery();

		// 2.인터페이스의 다형성
		Demo d2 = new DemoImpl();
		System.out.println(d2.PI);
		System.out.println(d2.A);
		d2.print();
		((DemoImpl) d2).write();// casting
		d2.setMute(true);
		Demo.changeBattery(); //d2.changeBattery는 왜안댐?

		// 3.인터페이스의 다형성
		Demo d3 = new DemoImpl();
		DemoImpl di = (DemoImpl) d3;

		System.out.println(di.PI);
		System.out.println(di.A);
		di.print();
		di.write();// casting
		di.setMute(true);
		Demo.changeBattery();

		// 4. interface Anonymous
		Demo d4 = new Demo() {

			@Override // 자식의 이름은 없고 알맹이만 써주겠다.
			public void print() {

			}

		};
	}
}

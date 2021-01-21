package IntExample;

public class Int {

	public static void main(String[] args) {
		int var1 = 10; //10진수로 저장
		int var2 = 012;//8진수로 저장
		int var3 = 0xA;//16진수로 저장

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}

}
//전부다 10이 출력됨 당연하지 자료형이 int 니까.
//정수끼리의 연산은 (byte char int 등등 다.) ->결국 int로 다 변환해서 처리해버림.

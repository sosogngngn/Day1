package byteExample;

public class byteExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i = 0 ; i <5;i++) {
			var1++;
			var2++;
			System.out.println("var1: "+ var1 + "\t"+"var2:" + var2);
		}
	}

}
//byte 는 8bit 최상위 비트는 부호를 나타낸다(MSB라고함)
//-128~127까지 표현가능함 이유는 최상위 비트는 부호로쓰기 때문에 나머지 7비트는 숫자의 크기를 나타낸다.
//그니까 -2의7승 ~ 2의7승-1
//var1 이 127에서 -128로 바로 넘어간다. 이유는? 바로위에랑 같음.
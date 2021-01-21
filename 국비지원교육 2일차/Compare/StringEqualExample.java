package Compare;

public class StringEqualExample {

	public static void main(String[] args) {
		String strVar1 = "신민철"; //신민철을 소요할순 없어도 신민철의 주소(참조)를 갖고있음
		String strVar2 = "신민철"; //주소값이 같음 strVar1이랑 
		String strVar3 = new String("신민철"); //다른 곳의 신용권 주소 생성.(객체)


		System.out.println(strVar1 == strVar2);//그래서 이게 true(주소값이 같음)
		System.out.println(strVar1 == strVar3);//false why? 다른 동네의 신밀철 주소값이니까
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		//객체의 주소같은건 모르겠고 그 주소의 내용(신민철)만 같으면 같다고 하겠다 할때 쓰는게  .equals다.
		System.out.println(strVar1.equals(strVar3));
		//주소는 다르더라도 내용은 같으니까 True!
	}

}

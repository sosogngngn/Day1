package p02.array;

public class Array_String_Ex {

	public static void main(String[] args) {
		
		//배열의 생성방법 3가지
		String[] str1 = {"홍길동1", "홍길동2", "홍길동3"};
		
		
		String[] str2 = new String[3];
		str2[0] = new String("홍길동1");
		str2[1] = new String("홍길동2");
		str2[2] = "홍길동3";
		
		String[] str3 = new String [] {"홍길동1", "홍길동2", "홍길동3"};
		
		//일반 for문
		for(int i=0 ; i<str3.length ; i++) {
			System.out.println(str3[i]);
		}
		
		//향상된 for문
		for(String s : str3) {
			System.out.println(s);
		}

	}

}

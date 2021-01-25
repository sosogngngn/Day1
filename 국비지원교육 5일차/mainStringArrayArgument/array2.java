package mainStringArrayArgument;

public class array2 {

	public static void main(String[] args) {
		String[] str1 = new String[3];
		str1[0]= "java";
	    str1[1]= "java";
	    str1[2] = new String("java");
	   
	    
	    System.out.println(str1[0]==str1[1]);//번지수가 같다. (같은 객체다)
	    System.out.println(str1[0]==str1[2]); // str1[2] 는 다른 객체 즉 다른 곳에 있는 java 이다. 그러니 같지않다. 번지수(주소)가 다르다.
	    System.out.println(str1[0].equals(str1[2])); // java란 내용이 같은걸 확인해야 할 때 이걸 쓴다.
	}
}
package mainStringArrayArgument;

public class array2 {

	public static void main(String[] args) {
		String[] str1 = new String[3];
		str1[0]= "java";
	    str1[1]= "java";
	    str1[2] = new String("java");
	   
	    
	    System.out.println(str1[0]==str1[1]);//�������� ����. (���� ��ü��)
	    System.out.println(str1[0]==str1[2]); // str1[2] �� �ٸ� ��ü �� �ٸ� ���� �ִ� java �̴�. �׷��� �����ʴ�. ������(�ּ�)�� �ٸ���.
	    System.out.println(str1[0].equals(str1[2])); // java�� ������ ������ Ȯ���ؾ� �� �� �̰� ����.
	}
}
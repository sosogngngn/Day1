package mainStringArrayArgument;

public class arrayCopy {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        //oldStrArray�� 0�� ���� newStrArray�� 0��°�� 3���� ��ŭ ����
	
		for(int i = 0 ; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i]+",");
		}
	}

}

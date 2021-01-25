package mainStringArrayArgument;

public class arrayCopy {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        //oldStrArray의 0번 값을 newStrArray의 0번째로 3길이 만큼 복사
	
		for(int i = 0 ; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i]+",");
		}
	}

}

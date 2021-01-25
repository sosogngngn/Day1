package mainStringArrayArgument;

public class arrayCopy2 {

	public static void main(String[] args) {
		char [] array1 = {'1','2','3','4','5'};
		char [] array2 = {'A','B','C','D','E'};
		char [] array3 = {'A','B','C','D','E'};
		
		System.out.print("Array1 의값: ");
		for(int i=0; i<array1.length;i++) {
			System.out.print(array1[i]);
		}
		System.out.println();	
		System.out.print("Array2 의값: ");
		for(int i=0; i<array2.length;i++) {
			System.out.print(array2[i]);
		}
		System.out.println();
		System.out.println();
		
		
		System.arraycopy(array1,0,array2,0,array1.length);
		//array1의 0번 값을 array2 의 0번 값부터  5길이만큼 복사.
		
		System.out.print("모든 Array2 문자를 숫자로 변경: ");
		for(int i=0; i<array1.length;i++) {
			System.out.print(array1[i]);
		}
		System.out.println();
		
		System.out.print("Array2의값: ");
		for(int i=0; i<array1.length;i++) {
			System.out.print(array2[i]);
		}
		System.out.println();
			
		
		System.arraycopy(array1,0,array3,2,2);
		//array1의 0번 값부터 array3의 2번 값부터 2개복사
		System.out.println();
		System.out.print("Array3의 3,4번째만 숫자로 변경 \n"+"Array1 배열값");
		for(int i=0; i<array1.length;i++) {
		System.out.print(array1[i]);
	}
		System.out.println();
		System.out.print("Array3 의값: ");
	
		for(int i=0; i<array3.length;i++) {
		System.out.print(array3[i]);
	
		}
	
		System.out.println();
	}
}
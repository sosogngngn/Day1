package mainStringArrayArgument;

public class arrayCopy2 {

	public static void main(String[] args) {
		char [] array1 = {'1','2','3','4','5'};
		char [] array2 = {'A','B','C','D','E'};
		char [] array3 = {'A','B','C','D','E'};
		
		System.out.print("Array1 �ǰ�: ");
		for(int i=0; i<array1.length;i++) {
			System.out.print(array1[i]);
		}
		System.out.println();	
		System.out.print("Array2 �ǰ�: ");
		for(int i=0; i<array2.length;i++) {
			System.out.print(array2[i]);
		}
		System.out.println();
		System.out.println();
		
		
		System.arraycopy(array1,0,array2,0,array1.length);
		//array1�� 0�� ���� array2 �� 0�� ������  5���̸�ŭ ����.
		
		System.out.print("��� Array2 ���ڸ� ���ڷ� ����: ");
		for(int i=0; i<array1.length;i++) {
			System.out.print(array1[i]);
		}
		System.out.println();
		
		System.out.print("Array2�ǰ�: ");
		for(int i=0; i<array1.length;i++) {
			System.out.print(array2[i]);
		}
		System.out.println();
			
		
		System.arraycopy(array1,0,array3,2,2);
		//array1�� 0�� ������ array3�� 2�� ������ 2������
		System.out.println();
		System.out.print("Array3�� 3,4��°�� ���ڷ� ���� \n"+"Array1 �迭��");
		for(int i=0; i<array1.length;i++) {
		System.out.print(array1[i]);
	}
		System.out.println();
		System.out.print("Array3 �ǰ�: ");
	
		for(int i=0; i<array3.length;i++) {
		System.out.print(array3[i]);
	
		}
	
		System.out.println();
	}
}
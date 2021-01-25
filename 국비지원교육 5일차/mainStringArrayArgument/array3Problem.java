package mainStringArrayArgument;
//최대값 구하기
public class array3Problem {

	public static void main(String[] args) {

		int max=0;
		int [] array = {1,5,3,8,2};
		int i;
		int tempt=0;
		for(i=0; i<array.length-1;i++) {
			if(array[i]<array[i+1]) {
				max=array[i+1];
			}
			//if(max<array[i]{
			// max = array[i];
		    // } -> 이렇게 간단하게 됨...
			else {
				tempt = array[i+1];
				array[i+1]=array[i];
				array[i]=tempt;
				max=array[i+1];
			}	
		}		
			System.out.println("max:" + max);
	}

}

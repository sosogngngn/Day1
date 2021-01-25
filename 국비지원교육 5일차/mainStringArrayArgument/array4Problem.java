package mainStringArrayArgument;

public class array4Problem {

	public static void main(String[] args) {
		int[][] array  = {
				{95,86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
								};
		
		int sum = 0;
		double avg = 0.0;
		int count =0;
		for(int i =0 ; i<array.length;i++) {
			for(int k=0 ; k<array[i].length ; k++) {
	
				count++;//나 이 count 생각못해냄..
				sum+=array[i][k];
				avg=sum/count;
			}			
		}
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);
	}

}

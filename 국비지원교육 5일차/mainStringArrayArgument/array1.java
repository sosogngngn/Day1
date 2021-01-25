package mainStringArrayArgument;

public class array1 {

	public static void main(String[] args) {
		int i ;
		int j ;
		
		int [][]  test = new int[2][3];
		
		for(i=0 ; i<test.length; i++) {   //test.length =3
			for(j=0 ; j<test[i].length;j++) { // test[0].length =4 , test[1].length =4 ,test[1].length =4 --> 1행에 4열이 있고 2행에도 4열이있고 3행에도 4열이있다.
				                             //test[2][3] = (0,0) (0,1) (0,2) 
				                             //             (1,0) (1,1) (1,2) 
				                             //             (2,0) (2,1) (2,2)
				test[i][j] = 0; // 각 원소값 초기화
				System.out.println("mathScore"+"["+i+"]"+"["+j+"] ="+ test[i][j]); // 출력
			}
		}
		// Java는 계단식으로도 출력이 가능하다. c언어는 안됨
		int[][] englishScore = new int[2][]; //englishScore = (0,?) (0,?) .....
		                                     //               (1,?) (1,?) .....
		englishScore[0] = new int[2];  //englishScore = (0,0) (0,1)
		englishScore[1] = new int[3];  //englishScore = (1,0) (1,1) (1,2)
		

		for(int k=0; k<englishScore.length; k++) {//englishScore.length =2
			for(int h=0; h<englishScore[k].length; h++)// englishScore[0].length = 2 , englishScore[1].length = 3
			{
				englishScore[k][h]=0;
				System.out.println("englishScore"+"["+k+"]"+"["+h+"] ="+ englishScore[k][h]);
			}
		}
		
		
		int[][] javaScore = { {95,80} , {92,96,80} }; // javaScore[0][0]=95 , javaScore[0][1]=80
		for(int q= 0; q<javaScore.length; q++){ // javaScore[1][0]=92 javaScore[1][1]=96 javaScore[1][2]=80 , javaScore.length=2
			for(int s = 0 ; s<javaScore[q].length; s++) { //javaScore[q].length= 2,3
				System.out.println("englishScore"+"["+q+"]"+"["+s+"] ="+ javaScore[q][s]);		
			}
			
		}	
	}
}

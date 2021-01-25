package mainStringArrayArgument;
import java.util.Scanner;
public class array5Problem {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0 ;
		int[] scores=null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			
			int selectNumber = sc.nextInt();
	
			
			if(selectNumber==1) {
				System.out.print("학생수>");
				studentNum = sc.nextInt();
			}
			
			
			else if(selectNumber==2) {
				scores = new int[studentNum];
				for(int i=0; i<studentNum ; i++ ) {
					System.out.print("scores["+i+"]"+">");
					scores[i]=sc.nextInt(); 
				}
			}
			
			else if(selectNumber==3) {
				for(int i=0; i<studentNum ; i++)
				{   
					System.out.println("scores["+i+"]"+">"+scores[i]);
				}
			}
			else if(selectNumber==4) {
				int sum = 0;
				int count = 0;
				double avg;
				int max=0;
				
				for(int i=0; i<studentNum ; i++) {
					count++;
					if(max<scores[i]) {
						max=scores[i];
								
					}
					sum+=scores[i];
			} 
				avg=sum/count;
				System.out.println("최고 점수:"+max);
				System.out.println("평균 점수:"+avg);
				}
			
			else if(selectNumber==5) {
				run=false;
			}
				
			}
					
		}
	
	}

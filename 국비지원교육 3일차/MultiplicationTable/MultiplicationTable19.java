package MultiplicationTable;

public class MultiplicationTable19 {
	public static void main(String[] args) {
		int num1;
		int num2;
		int i;
		
		for(num1=1;num1<20;num1++)
		{  System.out.println("********"+ num1 + "´Ü" + "********");
			for(num2=1;num2<20;num2++)
			{   
				i=num1*num2;				
				System.out.println(num1+"*"+num2+"="+ i);	
			}			
			System.out.println("\n");
		}
	}

}
//1~19´Ü 
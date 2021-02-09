package p07.polymorphism;

public class PolyMorphism_Primitive {

	public static void main(String[] args) {
	    byte a= 10;  //1byte  -128~127
	    short b= 20; //2byte  -3만2천768 ~3만2천767
	    int c = 330; //4byte  -21억~21억
	    long d =4000;//8byte 조가 넘어감.
	    
	    long e1 = a; //promotion(자동형변환)
	    long e2 = b; //promotion(자동형변환)
	    long e3 = c; //promotion(자동형변환)
	    
	    int k = (int)d; //-> 큰걸 작은거에 못 우겨넣음 강제형변환 해줘야함 
	    
	    System.out.println();
		
	}

}

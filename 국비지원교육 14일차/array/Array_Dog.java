package p02.array;
//import java.util.Scanner;
public class Array_Dog {

	//
	public static void main(String[] args) {
		
	        //복습 꼭하기! 다른 방법으로 풀어보자.
			Dog[] dog = new Dog[3];
			dog[0] = new Dog("풍산개","풍산");
			dog[1] = new Dog("진도개","진도");
		    dog[2] = new Dog("워리","불독");
		
		    Dog dd = new Dog("a1","a2");
		    System.out.println(dd);
		    //일반 for문
		        for(int i=0 ; i<dog.length ; i++) {
					System.out.println(dog[i].name + ":: " + dog[i].kind);
				}
				
				//향상된 포문
				for(Dog d : dog) { 
			    //Dog 의 배열을 생성해 줬기 때문에
			    //Dog 타입의 참조 변수를 선언해 줘야한다.
				//String s : 배열 일때는 개발자가 개발한 String 클래스의 문자열을 배열이 저장
				//하고 있기 때문에 String 타입의 변수를 선언해 준것이다.
					System.out.println(d.name + ":: " + d.kind);
	
				}
				
				for(Dog d2 : dog) { 
					System.out.println(d2);//주소값 => "풍산개
				}
				

				
	}
		
	
	
	
		/*Scanner sc = new Scanner(System.in);
		Dog[] dog = new Dog[3];
		Dog Dog = new Dog(sc.next(),sc.next());	
		
		for(int i=0 ; i<dog.length ; i++) {
			dog[i] = Dog;
		}
		
		for(int i=0 ; i<dog.length ; i++) {
			if(dog[i] !=null) {
			System.out.print(dog[i].name + dog[i].kind);
			System.out.println();
			}
		
		}
	}
*/
}

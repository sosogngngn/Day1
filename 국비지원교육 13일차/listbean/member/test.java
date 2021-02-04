package listbean.member;
import java.util.ArrayList;
import java.util.List;
public class test {

	public static void main(String[] args) {
	 List<Integer> a = new ArrayList<>(); // -> 사이즈 지정안해도됨
	 // ArrayList<Integer> a1 = new ArrayList();
	 // String[] b = new String[3]; // -> 사이즈 지정해야하나
	  
	  a.add(0);
	  a.add(2);
	  a.add(3);
	  a.add(3);
	  a.add(4);
	  a.add(5);
	  
	  List<Integer> list = a.subList(1,3); //List에 있는 1번요소 2번요소 를 반환해라.
	  
	  //a.remove(1);//1번째의 인덱스를 지워라
	  
	  //a.add(1,10); // add(앞,뒤) -> 앞은 List의 위치 뒤는 바꿀 값.
	  for(int i : a) {
		  System.out.println("값:" + i); //List에 0 1 2 3 4가 들어감
	  }
	  
	  System.out.println("--------------------------");
	  
	  for(int i:list) {
		  System.out.println("subList 메소드로 가져온 List: "+i);
	  }

	}

}

package listbean.member;
import java.util.ArrayList;
import java.util.List;
public class test2 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("홍길동");
		arrayList.add("임수빈");
		arrayList.add("안녕하세요");
		arrayList.add(1,"하이");
		
		//List에
		//홍길동 하이 임수빈 안녕하세요 이렇게 들어가 있음
		// [0] [1] [2]   [3]
		
		List<String> list = arrayList.subList(0,2); //->리스트에 [0],[1] 갖고와라.
		for(String i:arrayList) { //향상된 for문은 배열에서만 쓰이고 0번쨰 부터 끝번째까지 출력해주는데 유용하다.
			                      //기존 for 문은 i변수를 따로 둬서 체크를 했어야했는데 이거는 자동 빵으로 됨.
		System.out.println(i);
		}
		System.out.println();
		for(String i:list) {
			System.out.println("subList 메소드로 가져온 list"+i);
		}

	}

}

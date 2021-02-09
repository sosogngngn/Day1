package study05;

public class SearchService {
	
	Member[] members= new Member[5];
	
	public SearchService() {
		members[0] = new Member("홍길동",167,77,"대한민국");
		members[1] = new Member("James",187,67,"미국");
		members[2] = new Member("홍길동2",166,57,"일본");
		members[3] = new Member("홍길동3",177,80,"중국");
		members[4] = new Member("홍길동4",199,77,"인도");
		
		
	}
	boolean searchMember(String name) {
		for(int i=0 ; i <members.length ; i++) {
			if(members[i].getName().equals(name)) {
				System.out.println(members[i].getName()+ "으로 찾은 결과");
				System.out.println("이름:"+members[i].getName());
				System.out.println("신장:"+members[i].getHeight());
				System.out.println("몸무게:"+members[i].getWeight());
				System.out.println("국가:"+members[i].getNation());
				return true;		
			}
			
		}
		return false;
	}

}

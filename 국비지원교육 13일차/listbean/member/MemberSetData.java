package listbean.member;
import java.util.List;
import java.util.ArrayList;

public class MemberSetData {
	//Bean에 데이터 저장 방법
	MemberBean member = new MemberBean();
	public MemberBean setData1(){//홍길동
	member.setName(member);
	return member;

	}
	//List Bean에 여러개의 데이터들을 저장하는 방법2
	public List<MemberBean> setData(){ //이순신, 김창수
	
		List<MemberBean> array = new ArrayList<>();
		array.add(member.setName("이순신"));
		
		return array ;
	}
}

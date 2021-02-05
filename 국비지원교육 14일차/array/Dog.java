package p02.array;

public class Dog {
	String name;//풍산개  진도개   워리
	String kind;//풍산    진도   불독
	            // (풍산개, 풍산)
	            // (진도개, 진도)
	            // (워리, 불독)
	            //-----> 이렇게 출력되도록 해보자, 입력받고 출력하는 것도 해보자
	
	Dog(String name, String kind){
		this.name = name;
		this.kind = kind;
		
		}
	@Override //object 클래스를 상속 받아서 toString을 재정의 해줌.
	public String toString() {
		//모든 것의 조상인 object에서는 Dog dd = new Dog("a1","a2"); 
		//Dog 타입의 dd 참조변수를 선언하면 dd는 Dog class의 주소값을 갖고있다.
		//즉 System.out.println(dd);를하면 주소값이 출력되는 것이 
		//모든 것의 조상이 object 의 toString() 클래스의 규칙이다. 그러므로 항상 주소값이 나왔던 것이다.
		//근데 여기서 object의 toString을 Dog 클래스에 맞게 재정의 해줬다. 
		//return 값을 name+ " :::: " + kind  로 정의해 줘서
		//dd 값이 주소로 나오는 것이 아니라 name= "a1" kind="a2" 이기 때문에
		//재정의 해준 name+ " :::: " + kind 양식에 맞게 a1::::a2로 출력이 되는 것이다.
		
		return name+ " :::: " + kind;
	
}
 
	
}

package cha08;
//¹è¿­¿¡ °´Ã¼ ³Ö±â ¿¬½À.
public class Review1_Example {

 
	public static void main(String[] args) {
		Review1[] memberArray= new Review1[4];
		Review1 person1 = new Review1("ÀÓ¼öºó","18-13707","À±ÁÖ¾ß",28);
		Review1 person2 = new Review1("¾ÈÀ±ÁÖ","18-13706","»ç¶ûÇØ",27);
		Review1 person3 = new Review1("ÀÓ¼öºó","18-13705","dkssud",28);
		Review1 person4 = new Review1("ÀÓ¼öºó","18-13704","asd",28);
		
		memberArray[0]=person1;
		memberArray[1]=person2;
		memberArray[2]=person3;
		memberArray[3]=person4;
		
		for(int i=0; i<memberArray.length;i++) {
          Review1 member = memberArray[i];
          System.out.println(member.name+member.id+member.password+member.age);
	}

}
}
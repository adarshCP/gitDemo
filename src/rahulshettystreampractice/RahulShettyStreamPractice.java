package rahulshettystreampractice;

import java.util.ArrayList;

public class RahulShettyStreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> ar= new ArrayList<String>();
		ar.add("ADd");
		ar.add("ADd");
		ar.add("ADd");
		ar.add("ADd");
		ar.add("ADd");
		ar.add("ADd");

		long c =ar.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
//		ar.stream().filter(s->s.length()>2).forEach(s->System.out.println(s));
		ar.stream().filter(s->s.length()>2).limit(1).forEach(s->System.out.println(s));
		
	}

}

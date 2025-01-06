package rahulshettystreampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RahulShettyStreamMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"AdarSJa","Aajadj","Acjk1k12"};
		String[] names2 = {"vvcvAdarSJa","czAajadj","asdadAcjk1k12"};
		List<String> namesList =Arrays.asList(names);
		List<String> namesList2 =Arrays.asList(names2);
		
		// Find the list of names ending with a and those should be converted to Upper case
		namesList.stream().filter(s->s.endsWith("a"	)).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Find the list of names starts with a and those should be converted to uppercase and sorted 		
		namesList.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		
		Stream<String> newList =Stream.concat(namesList.stream(), namesList2.stream());
		boolean isContainName=newList.anyMatch(s->s.equalsIgnoreCase("adarSJa"));
		System.out.println(isContainName);
	}

}

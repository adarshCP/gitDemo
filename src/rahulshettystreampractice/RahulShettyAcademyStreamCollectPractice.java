package rahulshettystreampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RahulShettyAcademyStreamCollectPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number= Arrays.asList(1,2,3,55,4114,21,5);
		
	 List<Integer> modifiedList=	number.stream().distinct().sorted().collect(Collectors.toList());
	 System.out.println(modifiedList.get(2));

	}

}

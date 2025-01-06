import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num =1;
//		char let = 'r';
//		double dec= 5.99;
//		boolean myCard= true;
//		System.out.print(myCard);
		
		//Arrays
//		int array[]=new int[5];
//		array[0]=1;
//		array[1]=5;
//		array[2]=5;
//		array[3]=5;
//		array[4]=5;
//		int array2[]= {1,4,5,5};
//		
//		System.out.println(array2[1]);
		//ArrayLists
//		ArrayList<String> a = new ArrayList<String>();
//		
//		String[] names = {"Adff","afjafj"};
//		List<String> convertedArray =Arrays.asList(names);
//		System.out.println(convertedArray.contains("adad"));
//		a.add("Adarsh");
//		a.add("Adarsh");
//		a.add("Adarsh");
//		System.out.println(a.get(2));
//		
//		for(int i=0;i<a.size();i++) {
//			System.out.println(a.get(i));
//		}
//		for (String j : a) {
//			System.out.println(j);
//		}
		
		// Strings
		
		String s= "Adarsh C Prasad";
//		String[] splittedArray=s.split("C");
//		System.out.println(splittedArray[0]);
//		System.out.println(splittedArray[1]);
//		System.out.println(splittedArray[2]);
		for (int i = s.length()-1 ; i>=0; i--) {
			System.out.println(s.charAt(i));
			
		}
		Methodsdemo1 m1 = new Methodsdemo1();
		m1.getUserName();
		
	}
	//Methods
	
}

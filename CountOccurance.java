package Strings;

import java.util.HashMap;

public class CountOccurance {
	

	public static void main(String[] args) {
	
		String str="JavaProgramming";
		HashMap<Character,Integer> hp=new HashMap<>();
		for(int i=str.length()-1;i>=0;i--) {
			if(hp.containsKey(str.charAt(i))) {
				int count=hp.get(str.charAt(i));
				hp.put(str.charAt(i), ++count);
					
		}
		else
		{
			hp.put(str.charAt(i), 1);
		}
	}
	System.out.println(hp);
}
}

			
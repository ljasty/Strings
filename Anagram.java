package Strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
		String str1="care";
		String str2="race";
		
		str1=str1.toLowerCase();
	
		
	 char ch1[]=str1.toCharArray();
	 char ch2[]=str2.toLowerCase().toCharArray();
	 
	 Arrays.sort(ch1);
	 Arrays.sort(ch2);
	 
	 boolean result=Arrays.equals(ch1, ch2);
	 if(result)
	 {
		 System.out.println("two Strings Angram");
	 }
	 else {
		 System.out.println("two Strings not Angram"); 
		
	}
	}
}

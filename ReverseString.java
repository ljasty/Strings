package Strings;
//1)Write a java program reverse a string

public class ReverseString {
	public static void main(String[] args) {
		String str="hello";
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
		rev+=ch[i];
			
		}
		System.out.println(rev);
		
	}

}

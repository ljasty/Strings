package Strings;
//2)Write a java program to check string is palindrome or not?
public class Palindrome {
	public static void main(String[] args) {
		
	String str="Madam", reverseStr="";
	for(int i=str.length()-1;i>=0;i--) {
		reverseStr=reverseStr+str.charAt(i)	;
		}
	System.out.println(reverseStr);
	if(str.equalsIgnoreCase(reverseStr)) {
		System.out.println(str + " is palindrome String");
	}
		else
			System.out.println(str +" is not palindrome String");
	}
	}		



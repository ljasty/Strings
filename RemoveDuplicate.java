package Strings;
//5)write a java program to remove duplicate character from the given string? 
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		
	String str="removedeplicate";
	
LinkedHashSet<Character> set=new LinkedHashSet<>();
for(int i=0;i<str.length();i++)
	set.add(str.charAt(i));
for(Character ch:set)
	System.out.print(ch);
	

    
    
}   
    
}


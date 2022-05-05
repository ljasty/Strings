package Strings;

public class DuplicateChar {
	public static void main(String[] args) {
		String str="Beautiful life";
		char ch[]=str.toCharArray();
		System.out.println("The string is " +str);
		System.out.println("Duplicate charaters in the string are");
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]+" ");
					break;
				}
			}
	}

	}
}

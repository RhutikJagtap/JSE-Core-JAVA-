package set;

import java.util.LinkedHashSet;
import java.util.Scanner;

//Remove duplicate character from String
public class RemoveDuplicateCharacter {
	
	 static String removeDuplicateCharacter(String str) {
		
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		 
		 
		 for(int i=0;i<str.length();i++) {
			 char ch = str.charAt(i);
			 set.add(ch);
		 }
		 
		 String t="";
		 for(char ch:set) {
			 t=t+ch;
		 }
		 
		 return t;
	}

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		System.out.println(removeDuplicateCharacter(str));
	}

	
}

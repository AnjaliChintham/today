package cts;
import java.util.*;
public class Vowels {
public static void main(String[] args) {
	int c = 0 ;
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	sc.close();
	
	for(char i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			c++;
		}
	}
	System.out.println(s.length());
	System.out.println(c);
	
	
}
}

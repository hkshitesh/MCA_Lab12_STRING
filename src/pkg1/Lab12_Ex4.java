package pkg1;

import java.util.Scanner;
public class Lab12_Ex4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name= new String();		
		System.out.println("Enter Your Name");
		name= sc.nextLine();
		for(int i=0;i<name.length();i++)
		{
			int c= name.charAt(i);			
			c= c-32;
			char c1=(char)c;
			System.out.print(c1);			
		}
	}
}

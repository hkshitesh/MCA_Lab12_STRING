package pkg1;

import java.util.Scanner;
public class Lab12_Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name= new String();		
		System.out.println("Enter Your Name");
		name= sc.nextLine();
		int len=name.length();	
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(name.charAt(i)=='A' || name.charAt(i)=='a')
			{
				System.out.println("A is at "+(i+1));
				count++;
			}
		}		
		System.out.println("A is avaialble "+count+" times");
	}
}
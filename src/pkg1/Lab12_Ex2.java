package pkg1;
import java.util.Scanner;
public class Lab12_Ex2 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		String s1= new String();
		String s2= new String();
		System.out.println("First String");
		s1= sc.nextLine();
		System.out.println("Second String");
		s2= sc.nextLine();
		int last=0;
		int len1= s1.length();
		int len2= s2.length();	
		for(int i=0;i<=(len1-len2);i++)
		{
		if(s1.substring(i,len2+i).equals(s2))
		{
		if(last==0)
		System.out.println("first occurance is at possition :"+(i+1));
		last=i+1;
		}
		}
		if(last!=0)
		System.out.println("last occurance is at possition :"+last);
		else
		System.out.println("the string is not found");		
	}
}

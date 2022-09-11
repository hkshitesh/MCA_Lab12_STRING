/**
 * 
 */

/**
 * @author Hammad
 *
 */
public class Largest {
	int findLargest(int a,int b, int c)	{
		if(a>b && a>c)
			return a;
		else if(b>c)
			return b;
		else 
			return c;	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largest l1=new Largest();
		System.out.println("Largest Number: "+l1.findLargest(10, 20, 30));
		
		
	}

}

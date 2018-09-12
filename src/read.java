import java.util.Scanner;


public class read {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("given number is positive");
		}
		else
		{
			System.out.println("not");
		}
		
	    if(a>1000)
		{
			System.out.println("greater than 1000");
			
		}
	    else
	    {
	    	System.out.println("not");
		if(a>1000 && a%10==3 )
		{
			System.out.println("p a number");
		}
		else
		{
			System.out.println("not");
		}
	   
	   if(a%16==0)
		{
			System.out.println("16 divisible 16");
		}
		else
		{
			System.out.println("not");
		}
	}

}
}

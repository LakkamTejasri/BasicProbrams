import java.util.Scanner;


public class Amstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n number");
		int n=sc.nextInt();
	
		int a,temp=0,t=n;
		
			while(n!=0)
			{
				a=n%10;
				temp=temp+(a*a*a);
				n=n/10;
			}
			//n=n/10;
			if(temp==t)
			{
				System.out.println("given number is amstr");
				
			}
			else
			{
				System.out.println("not ");
			}
	}

}

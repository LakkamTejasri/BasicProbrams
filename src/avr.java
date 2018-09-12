import java.util.*;
public class avr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int[] a=new int[n];
		int sum=0;int c=0,l=0;
		System.out.println("enter the elemnents");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
		
		if(a[i]%11==0)
		{
			sum=sum+a[i];
			l++;
		}
		
   }
		//System.out.println(sum/l);
	if(sum/l>50)
	{
		System.out.println("grea than 50");
	}
	else
	{
		System.out.println("not");
	}
}
}

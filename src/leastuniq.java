import java.util.*;
public class leastuniq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,l=0,c=1,t=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int[] a=new int[n];
		int temp=0;
		System.out.println("enter the elments");
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
			sum=sum+a[i];
			l++;
		}
		System.out.println("the avgr "+sum/l);
		temp=0;
        for(int j=0;j<a.length;j++)
        {
        	int k=0;
        	if(a[k]==a[j])
        	{
        		a[k]=a[j];   
        	}
        	if(k<a[j])
        	{
        		System.out.println(a[j]);
        	}
        	 
        }
       
	
        }
}

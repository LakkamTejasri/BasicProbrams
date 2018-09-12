
public class dusum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,sum=0;
		int[] a={1,1,2,3,3,4,4,4};
		
		for(int i=0;i<a.length;i++)
		
		{
			 c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			
				if(c>1)
				{
					sum=sum+a[i];
				}
			}
		  System.out.println(sum);		}
	
}



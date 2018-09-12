
public class eveod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=0,k=1;
		int[] a={2,3,1,4,5,6,8,9};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[j]=a[i];
				j=j+2;
			}
			else
			{
				b[k]=a[i];
				k=k+2;
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}


public class enen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
    int k=1,j=0;
	int[] n={2,3,1,5,6,9,4};
	for(int i=0;i<n.length;i++)
		while(true)
		{
			if(j<n.length && n[j]%2==0)
			{
				j=j+2;
			}
			if(j<n.length && n[j]%2==1)
			{
				k=k+2;	
			}
			if ( j<n.length && k<n.length)
            {
                int temp = n[j];
                n[j] = n[i];
                n[i] = temp;
            }
			else
				break;
		}
	  
	for(int i=0;i<n.length;i++)
	{
		System.out.println(n[i]);
	}

}

}

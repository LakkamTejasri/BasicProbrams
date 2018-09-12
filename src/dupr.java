
public class dupr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubi
		int c=0,k=0;
		int[] n={3,3,3,2,2,1,1,1,4,4,4,4,4,4,5};
		for(int i=0;i<n.length;i++)
		{ 
			c=1;
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					c++;
				}
			}
				if(c==3)
				{
					
					k++;
				
			        }
					
					
				
	  	}
		   System.out.println(k);
		
		}
		
	}
	

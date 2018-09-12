
public class uniq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,4,3,2,4};
	;int k=0;
		for(int i=0;i<a.length;i++){
			
		 for(int j=0;j<i;j++)
	        {
	        	if(a[i]==a[j])
	        	{
	       
	        		break;
	        	}
	    
	        	if(i==j)
	        	{
	        	System.out.println(a[i]);
	        	}
	        }
	       while (a[i]>k)	
	       {
	    	   a[i]=k;
	}
		
}
	}
}

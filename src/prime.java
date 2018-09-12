
public class prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int	c=0,k=0;
		for(int i=1;i<=100;i++)
		{ 
			c=0;
			for(int j=1;j<=100;j++)
			{
				//c=0;
				if(i%j==0)
				{
					c++;
				}
			}
				if(c==2)
				{
					if(k%3==0)
					{
					System.out.println(i);
					}
					k++;
				}
			}
		}
	}

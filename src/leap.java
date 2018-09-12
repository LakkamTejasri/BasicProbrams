
public class leap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1401;i<2000;i++)
		{
			if(i%400==0)
			{
				System.out.println(i);
			}
			else if(i%4==0)
			{
				System.out.println(i);
			}
		}

	}

}

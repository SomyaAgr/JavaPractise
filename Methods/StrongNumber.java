class StrongNumber 
{
	public static void main(String[] args)
	{
		int num = 145,  ori = num , ld=0,sum=0 , fact=1;
		while (num > 0)
		{
			ld= num % 10;
			for (int i =1; i <=ld ;i++ )
				{
					fact = fact*i;
				}
			sum +=fact;
			num = num/10;
			fact=1;// to restart the loop 
		}
		
		if(ori==sum)
		{
			System.out.println( "the original number is " + ori + " and is equal to " + sum +  " so it is a strong number ");	
		}
		else
		{
			System.out.println( "the original number is " + ori + " and is not equal to " + sum +  "  so it is not a  strong number ");				
		}
	}
}
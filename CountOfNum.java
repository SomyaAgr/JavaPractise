class CountOfNum 
{
	public static void main(String[] args) 
	{
		int num=1231234657,count=0;

		while(num>0 )
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}

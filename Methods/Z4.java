class Z4 
{
	public static int test(int a)
	{
		if(a==1)
		{
			return -1;
		}
		return a*test(a-1);
	}
	public static void main(String[] args) 
	{
		int a=4;
		int result=test(a);
		System.out.println(result);
	}
}

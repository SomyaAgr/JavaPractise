class Factorials 
{
	public static int factOfNum(int num )
	{
		int fact=1;
		for (int i=1; i<=num;i++ )
		{
			fact=fact*i;
		}
		System.out.println("The factorial of  "+num+ " is " );
		return fact;
	}
	public static void main(String[] args) 
	{
		int res=factOfNum(5);
		System.out.println(res);
	}
}

class PrintRangeRecursion 
{
	public static void rangePrint(int a , int b)
	{
		if(a<=b)
		{
			System.out.println(a);
			a++;
			rangePrint( a, b);
		}
		else 
		{
			return;
		}
	}
	public static void main(String[] args) 
	{
		rangePrint(50,55);
	}
}

class PrintNumRecursion 
{
	public static void printingNum(int i)
	{
		if(i<=10)
		{
			System.out.println(i);
			i++;
			printingNum(i);
		}
		else
		{
			return;
		}
		
	}
	public static void main(String[] args) 
	{
		printingNum(1);
	}
}

class DisariumNum 
{
	public static int countDigit(int num)
	{
		int count =0;
		while(num>0)
		{
			count++;
			num = num / 10;
		}
		return count;
	}
	public static int power(int ld , int count )
	{
		int power=1;
		for (int i=count;i>0; i--)
		{
			power= power*ld;
		}
		return power;
	}
	public static void main(String[] args) 
	{
		int num = 89;
		int ori = num; 
		int sum =0;
		int count = countDigit(num);
		while (num>0)
		{
			int ld= num % 10;
			int power= power(ld ,count);
			sum = sum+ power;

			num = num /10;
			count--;
		}
		if (ori==sum)
		{
			System.out.println("It is a disarim number ");
		}
		else
		{
			System.out.println("It is not a disarim number ");
		}
	}
}
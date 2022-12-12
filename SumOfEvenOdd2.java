class SumOfEvenOdd2 
{
	public static void main(String[] args) 
	{
		int num =234,sumEven=0,sumOdd=0,ld=0;
		while(num>0)
		{
			ld=num%10;
			if(ld%2==0)
			{
				sumEven=sumEven+ld;
			}
			else 
			{
				sumOdd=sumOdd+ld;
			}
			num=num/10;
		}
			System.out.println("The sum of even number is :"+sumEven);
			System.out.println("The sum of odd nuber is :"+sumOdd);
	}
}

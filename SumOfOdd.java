class SumOfOdd 
{
	public static void main(String[] args) 
	{
		int num =234,sum=0,ld=0;
		while(num>0)
		{
			ld=num%10;
			if(ld%2!=0)
			{
				sum=sum+ld;
			}
			num=num/10;
		}
			System.out.println("The sum of odd number is "+sum);

	}
}

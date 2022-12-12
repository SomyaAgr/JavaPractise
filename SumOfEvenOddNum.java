class SumOfEvenOddNum 
{
	public static void main(String[] args) 
	{
		int i=1;
		int sum=0 , sumO=0; 
		while (i<=10)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			else 
				{
					sumO=sumO+i;;
				}
			i++;
		}
		System.out.println(sum + "  of Even Number");
		System.out.println(sumO + "  of Odd Number");
	}
}

class SumOfEvenNum2 
{
	public static void main(String[] args) 
	{
		int num=12345;
		int sum=0,ld;
		while (num>0)
			{
				if(num%2==0)
					{
						ld=num%10;
						sum=sum+ld;
					}
				num=num/10;
			}
		System.out.println(sum);
	}
}

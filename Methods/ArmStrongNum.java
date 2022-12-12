class ArmStrongNum 
{
	public static int powerOfNum(int last_digit , int count )
	{
	    int power = 1 ;
		for(int i=1;i<=count;i++)
		{
			power = power * last_digit;
		}
		return power;
	}
	public static void main(String[] args) 
	{
		int numCount = 371;
		int numPow =numCount, original = numCount ;
		int last_digit = 0, count =0 , sum =0 , power;
		while (numCount > 0)
		{
			count++;
			numCount = numCount/10;
		}
		while (numPow>0)
		{
			last_digit = numPow % 10;
			power = powerOfNum(last_digit, count);
			sum = sum + power;
			numPow = numPow/10;	
		}	
		if (original == sum)
		{
			System.out.println(sum+" is a ArmStrong number");
		}
		else
		{
			System.out.println(sum+ " is not a ArmStrong Number");
		}
	}
}

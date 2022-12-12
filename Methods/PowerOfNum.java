class PowerOfNum 
{
	public static int powOfNum(int num, int pow)
	{
		int power=1;
		for(int i=1;i<=pow;i++)
		{
			pow--;
			power=power*i;
		}
		return power;
	}
	public static void main(String[] args) 
	{
		int pow=powOfNum(9,3);
		System.out.println(pow);

	}
}

class AbsoluteValue
{
	public static void absolute(int a)
	{
		if (a<0)
		{
			a=-a;
			System.out.println(a);
		}
		else 
		{
			System.out.println(a);
		}
		System.out.println();
	}
	public static void main(String[] args)
	{		
			absolute(-12);
			absolute(34);
	}
}
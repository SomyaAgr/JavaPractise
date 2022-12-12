class Factorial 
{
	public static void main(String[] args) 
	{
		int fact=1, x=7;
		for (int i =1; i<=x ;i++ )
		{
			fact=fact*i;
		}
		System.out.println("the factorial of " + x+" is "+ fact);
	} 
}

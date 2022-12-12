class A
{
	public static void addition(int a , int b )
	{
		int sum=0;
		sum=a+b;
		System.out.println("The Sum of " +a + " and "+b + " is " + sum); 
	}
	public static void factorial (int a ) 
	{
		int fact =1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of "+a +" is "+fact);
	}
	public static void main(String[] args) 
	{
		System.out.println("The additon is \n");
		addition(20,34);
		addition(123,456);
		System.out.println("\nThe factorial is \n" );
		factorial(7);
		factorial(5);
	}
}

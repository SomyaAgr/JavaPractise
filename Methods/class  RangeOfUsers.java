import java.util.Scanner;
class  RangeOfUsers
{
	public static int range(int a , int b)
	{
		for (int i =a; i<=b ;i++ )
		{
			return i;
		}
	}
	public static void main(String[] args) 
	{
		int range = range(10,20);
		System.out.println(range);
	}
}

import java.util.Scanner;
class  RangeOfUsers
{
	public static void main(String[] args) 
	{
		Scanner  range= new Scanner(System.in);
		System.out.println("Enter a range: ");
		int a=range.nextInt();
		int b=range.nextInt();
		System.out.println("The range is: ");
		for (int i =a; i<=b ;i++ )
		{
			System.out.println(i);
		}
	}
}

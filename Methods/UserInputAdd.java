import java.util.Scanner;
class UserInputAdd 
{

	public static void main(String[] args) 
	{
		int a=0  , b=0 ,c =0;
		Scanner add = new Scanner(System.in);
		System.out.println("Enter 2 number");// ask user to eneter number
		a=add.nextInt();// allow user to enetr first nummber
		b = add.nextInt();// allwo user to enter second number 
		c = a+b;
		System.out.println("The sum of "+a + " and " + b + " is  " + c);
	}
}

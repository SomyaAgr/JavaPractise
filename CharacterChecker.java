class  CharacterChecker
{
	public static void main(String[] args) 
	{
		char ch = '*';
		if (ch>='A' && ch<='Z')
		{
			System.out.println("SQL");
		}
		else if (ch>='a' && ch<='z')
		{
			System.out.println("MANNUAL");
		}
		else if (ch>=0 && ch<=9)
		{
			System.out.println("Java");
		}
		else if (ch==' ')
		{
			System.out.println("Selenium");
		}
		else 
		{
			System.out.println("Web Tech");
		}
	}
}

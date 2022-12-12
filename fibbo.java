class fibbo{
	public static void main(String [] args)
	   	{
	 		System.out.println("FIBBONANCI SERIES PRINTING");
			int a = 0 , b = 1,i=0;
			do
				{
					
					System.out.println(a);// 0, 1
					int c=a+b;//c=1
					a=b;
					b=c;
					i++;
				}
			while(i<=10);
		}	
}
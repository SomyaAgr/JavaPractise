class TypeCaste 
{
  public static void main(String[]args)
	{
	      System.out.println("Demostrating implicit");
	      int s=10,r;
	      long x=s,y=90;
	      double dou=y; 
                         s=(int)x;
	       r=(int)dou;
	      System.out.println(x);
	      System.out.println("Demonstrate Explicit ");
	      System.out.println(s+89);
                         System.out.println("The double value  "+ dou +" \n i m int value  " + r );
	}
}
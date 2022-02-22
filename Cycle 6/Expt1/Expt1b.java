class Expt1b
{
  public static void main(String args[])
  {
    try
    {
      int a[]={1,2,3,4,5};
      System.out.println(a[8]);
      catch(ArrayIndexOutOfBoundsException e)
		  {
			    System.out.println(e);
		  }
    }
  }

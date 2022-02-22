class Expt1a
{
  public static void main(String args[])
  {
    try
    {
      int a=10,b;
      b=a/0;
      System.out.println(b);
    }
    catch(ArithmeticException e)
    {
      System.out.println(e);
    }
  }
}

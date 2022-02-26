/*Write a program that creates user defined exception when the balance in an account is less than 500*/

class Expt2
{
  
  public static void main(String args[])
  {
    try
    {
      int b=100;
      if(b<500)
      {
        throw new lowbalanceException();
      }
    }
    catch(lowbalanceException e)
    {
      System.out.println(e);
    }
  }
class lowbalanceException extends Exception
{
  lowbalanceException()
  {
      System.out.println("Low balance");
  }
}

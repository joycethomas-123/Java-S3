import java.util.*;
class prime
{
  public static void main(String args[])
  {
    int n,i,m=0,a=0;
    System.out.println("Enter a number");
    Scanner obj=new Scanner(System.in);
    n=obj.nextInt();
    m=n/2;
    if(n==0||n==1)
    {
      System.out.println("It is not a prime number");
    }
    else
    {
      for(i=2;i<=m;i++)
      {
        if(n%i==0)
        {
          a=1;
          break;
        }
        if(a==1)
        {
          System.out.println("It is not a prime number");
        }
        else
        {
          System.out.println("It is a prime number");
        }
      }
    }
  }

import java.util.*;
class odd
{
  public static void main(String args[])
  {
    int n;
    System.out.println("Enter a number");
    Scanner obj=newScanner(System.in);
    n=obj.nextInt();
    if(n%2==0)
    {
      System.out.println("It is even");
      }
    else
    {
      System.out.println("It is odd");
    }
  }
}

import java.util.*;
class palindrome
{
  public static void main(String args[])
  {
    int temp,sum=0,r;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter an integer");
    int n=obj.nextInt();
    temp=n;
    while(n>0)
    {
      r=n%10;
      sum=(sum*10)+r;
      n=n/10;
    }
    if(temp==sum)
    {
      System.out.println("It is a palindrome");
    }
    else
    {
      System.out.println("It is not a palindrome");
    }
  }
}

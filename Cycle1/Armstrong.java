import java.util.*;
class Armstrong
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
      sum=sum+(r*r*r);
      n=n/10;
    }
    if(temp==sum)
    {
      System.out.println("It is an Armstrong number");
    }
    else
    {
      System.out.println("It is not an Armstrong number");
    }
  }
}

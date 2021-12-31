import java.util.*;
class natural
{
  public static void main(String args[])
  {
    int i,sum=1;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter no of natural numbers needed");
    int n=obj.nextInt();
    for(i=1;i<n;i++)
    {
      sum=sum+i;
    }
    System.out.println("The sum of natural numbers is"+sum);
  }
}

import java.util.*;
class factor
{
  public static void main(String args[])
  {
    int i;
    System.out.println("Enter an integer");
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    System.out.println("Factors are:\n");
    for(i=1;i<=n;i++)
    {
      if(n%i==0)
      {
        System.out.println(+i);
      }
    }
  }
}

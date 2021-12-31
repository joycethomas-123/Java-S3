import java.util.*;
class factorial
{
  public static void main(String args[])
  {
    int i,fact=1;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter an integer");
    int n=obj.nextInt();
    for(i=1;i<n;i++)
    {
      fact=fact*i;
    }
    System.out.println("Factorial is"+fact);
  }
}

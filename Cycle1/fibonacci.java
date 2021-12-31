import java.util.*;
class fibonacci
{
  public static void main(String args[])
  {
    int i,count;
    int n1=0,n2=1,n3;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the no of fibonacci series");
    int count=obj.nextInt();
    System.out.println("Fibonacci series is");
    System.out.println(" "+n1);
    System.out.println(" "+n2);
    for(i=2;i<count;i++)
    {
      n3=n1+n2;
      System.out.println(" "+n3);
      n1=n2;
      n2=n3;
    }
  }
}

      
    

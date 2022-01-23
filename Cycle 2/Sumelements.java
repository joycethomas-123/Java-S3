import java.util.*;
class Sumelements
{
  public static void main(String args[])
  {
    int i,sum=0;
    System.out.println("Enter the number of elements present in the array");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    System.out.println("Sum of the elements is: ");
    for(i=0;i<n;i++)
    {
      sum=sum+a[i];
    }
    System.out.println(+sum);
   }
  }
      
    

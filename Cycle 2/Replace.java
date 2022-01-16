import java.util.*;
class Replace
{
  public static void main(String args[])
  {
    System.out.println("Enter the number of elements present in the array");
    Scanner sc=new Scanner(System.in);
    int n=sc.next Int();
    int a[]=new int[n];
    System.out.println("Enter the elements in the array");
    int i;
    for(i=0;i<n;i++);
    {
      a[i]=sc.nextInt();
    }
    System.out.println("Enter the location in which the number to be replaced");
    int p=sc.nextInt();
    System.out.println("Enter the number to be replaced");
    int q=sc.nextInt();
    a[p]=q;
    System.out.println("New Array is");
    for(i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
  }
}

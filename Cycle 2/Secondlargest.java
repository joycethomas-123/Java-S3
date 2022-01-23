import java.util.*;
class Secondlargest
{
  public static void main(String args[])
  {
    int i,j,temp;
    System.out.println("Enter the number of elements present in the array");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements present in the array");
    for(i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    System.out.println("Second largest element of the array is"+a[n-2]);
    for(i=0;i<2;i++)
    {
      for(j=0;j<n-i-1;j++)
      {
        if(a[j]>a[j+1])
        {
          temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
   }
  }
}

import java.util.*;
class Largest
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        n=obj.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the elements in the matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=obj.nextInt();
               
            }
        }
        int large=a[0][0];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]>large)
                {
                    large=a[i][j];
                }
            }
        }
         System.out.println("Largest no is "+large);
    }
}

import java.util.*;
class Transpose
{
  public static void main(String args[])
  {
    int row,col,i,j;
    System.out.println("Enter number of rows");
    Scanner in=new Scanner(System.in);
    row=in.nextInt();
    System.out.println("Enter number of columns");
    col=in.nextInt();
    int a[][]=new int[row][col];
    System.out.println("Enter elements in matrix ");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            a[i][j]=in.nextInt();
            System.out.println();
        }
    }
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            if(i==j)
            {
                a[j][i]=a[i][j];
            }
        }
    }
    System.out.println("Transpose of matrix is:\n");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            System.out.println(+a[j][i]);
        }
    }
    
   }
  }
  

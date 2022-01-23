import java.util.*;
class Addarrays
{
  public static void main(String args[])
  {
    int row,col,i,j;
    System.out.println("Enter number of rows");
    Scanner in=new Scanner(System.in);
    row=in.nextInt();
    System.out.println("Enter number of columns");
    col=in.nextInt();
    int mat1[][]=new int[row][col];
    int mat2[][]=new int[row][col];
    int res[][]=new int[row][col];
    System.out.println("Enter elements in matrix 1");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            mat1[i][j]=in.nextInt();
            System.out.println();
        }
    }
    System.out.println("Enter elements in matrix 2");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            mat2[i][j]=in.nextInt();
            System.out.println();
        }
    }
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            res[i][j]=mat1[i][j]+mat2[i][j];
        }
    }
    System.out.println("Result= \n");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            System.out.println(+res[i][j]);
        }
    }
    
   }
  }

import java.util.*;
class Main
{
    public static void main (String args[])
    {
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string length");
        int n=in.nextInt();
        System.out.println("Enter the string");
        char c[]=new char[50];
        for(i=0;i<n;i++)
        {
             c[i] = in.next().charAt(0);
        }
        Character ch=new Character();
        ch.Frequency(c,n);
        ch.Reverse(c,n);
    }
}
class Character
{
    void Frequency(char c[],int n)
    {
        Scanner sc=new Scanner(System.in);
        int i,f=0;
	    System.out.print("Enter a character whose frequency is to be found:");
	    char y = sc.next().charAt(0);
	    for(i=0;i<n;i++)
	    {
	        if(c[i] == y)
	        {
	             f=f+1;
	        }
	    System.out.println("Frequency of entered character is "+f);
	    }
     }

    void Reverse(char c[],int n)
    {
        int m;
        char r[] = new char[50];
        int i;
        for(m=0;m<=n-1;m--)
        {
            for(i=0;i<n;i++)
            {
                r[i] = c[m];
            }
        }
        System.out.println("Reversed String is: ");
        for(i=0;i<n;i++)
        {
            System.out.print(+r[i]);
        }
    }

}

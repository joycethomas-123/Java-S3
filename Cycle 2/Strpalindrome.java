import java.util.*;
class Strpalindrome
{

    public static void main (String args[]) 
    {   
        int i;
        String s,rev="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string:");
        s=in.nextLine();
        int length=s.length();
        for(i=length-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev))
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");   
        }
    }
}


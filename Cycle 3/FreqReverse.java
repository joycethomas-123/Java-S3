import java.util.*;
public class FreqReverse
{
    public static void main(String args[])
    {
        FreqReverse fr=new FreqReverse();
        fr.Frequency();
        fr.Reverse();
        
    }
    void Frequency()
    {
        
        Scanner obj=new Scanner(System.in);
        int i,count=0;
        char ch;
        String word;
        System.out.println("Enter a word");
        word =obj.nextLine();
        System.out.println("Enter a letter present in the word");
        ch=obj.nextLine().charAt(0);
        int n=word.length();
        for(i=0;i<n;i++)
        {
            if(ch==word.charAt(i))
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("Letter is not present in the word");
        }
        else
        {
            System.out.println("Frequency of letter "+ch+" in word "+word+" is "+count);
        }
    }
    void Reverse()
    {
        String original,reverse="";
        int i,length;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a word");
        original=obj.nextLine();
        length=original.length();
        for(i=length-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
        }
        System.out.println("Reverse of the string is: "+reverse);
    }
}



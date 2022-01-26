import java.util.*;
class Freqency
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String word;
        int count=0,i,n;
        System.out.println("Enter a word");
        word=obj.nextLine();
        n=word.length();
        char ch;
        System.out.println("Enter the letter to be counted in the word");
        ch=obj.next().charAt(0);
        for(i=0;i<n;i++)
        {
            if(word.charAt(i)==ch)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("Letter is not presesnt in the word");
        }
        else
        {
            System.out.println("Frequency of letter "+ch+" in word "+word+" is "+count);
        }
        
    }
}


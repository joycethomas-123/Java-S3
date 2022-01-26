import java.util.*;
class PartChar
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String word;
        int flag=0,i,n;
        System.out.println("Enter a word");
        word=obj.nextLine();
        n=word.length();
        char ch;
        System.out.println("Enter the letter to be searched in the word");
        ch=obj.next().charAt(0);
        for(i=0;i<n;i++)
        {
            if(word.charAt(i)==ch)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("The given letter is not present in the word");
        }
        else
        {
            System.out.println(ch+" is present in "+word+" at position "+(i+1));
        }
        
    }
}

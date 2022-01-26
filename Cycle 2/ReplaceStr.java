import java.util.*;
class ReplaceStr
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String word;
        System.out.println("Enter a word");
        word=obj.nextLine();
        char ch,r;
        System.out.println("Enter the letter to be replaced in the word");
        ch=obj.next().charAt(0);
        System.out.println("Enter the letter with which to be replaced");
        r=obj.next().charAt(0);
        word=word.replace(ch,r);
        System.out.println("Word with replaced letter: "+word);
        
    }
}


import java.util.*;
class Numstring
{
    public static void main(String args[])
    {
        int a,b;
        String word1,word2;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first integer:");
        a = obj.nextInt();
         System.out.print("Enter second integer:");
        b = obj.nextInt();
        System.out.print("Enter first  word: ");
        word1 = obj.next();
        System.out.print("Enter second word: ");
        word2 = obj.next();
        
        
       
        Numstring obj1 = new Numstring();
        obj1.Concatenate(a,b);
        obj1.Concatenate(word1,word2);
    }
}

class String 
{
    void Concatenate(int a,int b)
       { 
            System.out.println("Concatenated numbers are:" +a+b);
       }
    
    void Concatenate(String word1,String word2)  
       {
            System.out.println("Concatenated words are:" +word1+word2);
       }
}

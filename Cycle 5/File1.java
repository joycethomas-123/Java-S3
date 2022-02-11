import java.io.*;
import java.util.*;
class File1
{
  public static void main(String args[])throw exception
  {
    FileInputStream file=new FileInputStream("e1.txt");
    int i=1;
    int ch;
    System.out.println(i+"-");
    while((ch=file.read()!=-1)
    {
        System.out.println((char)ch);
         if(ch=='/n')
         {
              System.out.println(++i+"-");
         }
    }
    file.close();
     }
   }
          

import java.util.*;
import java.io*;
class File3
{
  public static void main(String args[])throw exception
  {
    try
    {
      Scanner sc=new Scanner(System.in);
      FileWriter Fw=new FileWriter("e1.txt");
      System.out.println("Enter your name");
      String name=sc.nextLine();
      Fw.wait(name+"\n");
      Fw.write(address);
      Fw.close();
      FileReader Fr=new FileReader("e1.txt");
      int ch;
      while((ch=Fr.read())!=-1)
      {
        System.out.println((char)ch);
        Fr.close();
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
  }
                         

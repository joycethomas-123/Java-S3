import java.util.*;
class Expt1c
{
  public static void main(String args[]) throws Exception
  {
    try
    {
      FileInputStream file=new FileInputStream("expt.txt");
      int i;
      while((i=file.read())!=-1)
      {
        System.out.println((char)i);
      }
      catch(FileNotFoundException e)
		  {
			    System.out.println(e);
		  }
	}
  }
}

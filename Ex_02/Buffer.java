import java.io.*;
class Buffer
{
  public static void main ( String args[] )
  {
   char a[]=new char [100];
    try
     {
     FileReader file =new FileReader( "input.txt" );
     BufferedReader input =new BufferedReader (file);

     input.read(a);
     System.out.println("Data in the file ");
     System.out.println(a);

     input.close();
     }

     catch(Exception e)
     {
       e.getStackTrace();
     }
   }
}

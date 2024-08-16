package My_Pack;
import Pack.*;        //all classes enums records from "Pack" package are import in this program

class Package_B
{
  public static void main(String args[])
   {
     Package_A obj = new Package_A();  //object of class "Package_A" from "Pack" package created as "obj" 
     obj.msg();                        //msg method is called through an object "obj"
   }
}
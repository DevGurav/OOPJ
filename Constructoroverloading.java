import java.util.*;

class First
{
 int a , b ,c;
 First ()
 {
  //a=b=c=0;   (Default Constructor)
 }
 First (int d , int e)    //Constructor overloading 
 {  
  a=d;
  b=e;
  c=e;
 }
 First (int f , int g , int h) //Constructor Overloading by number of parameters
 {
  a=f;
  b=g;
  c=h;
 } 
 First (double i , double j)  //Constructor Overloading by changing data type of parameters
 {
   a=i;
   b=j;
 }
 int add(){return a+b+c;}     //Method to calculate result
}

class Constructoroverloading
{
 public static void main(String args[])
 {
  First m1 = new First ();                //Invoked constructor when object is created
  First m2 = new First ( 10 , 20 );
  First m3 = new First ( 10 , 20 , 30 );
  First m4 = new First ( 2.33 , 5.34 );
  int a = m1.add();
  System.out.println("First constructor "+a);
  System.out.println("Second constructor " +m2.add());
  System.out.println("Third constructor " +m3.add());
  System.out.println("Third constructor " +m4.add());  
 }
}
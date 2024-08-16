import java.util.*;
class Adder
{
static int add(int a, int b){return a+b;}
static double add(double a, double b){return a+b;}   //Method overloading by changing data type 
int add (int a , int b  , int c){return a+b+c;}      //Method overloading by number of parameters
}
class MethodOverloading
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
int a,b,e,f,g;
double c,d;
System.out.println("enter two Integer values");
a=s.nextInt();
b=s.nextInt();
System.out.println("enter two Double values");
c=s.nextDouble();
d=s.nextDouble();
System.out.println("enter three Integer values");
e=s.nextInt();
f=s.nextInt();
g=s.nextInt();

System.out.println("Addition of Integer is "+Adder.add(a,b));
System.out.println("Addition of Integer is "+Adder.add(c,d));
System.out.println("Addition of Integer is "+Adder.add(e,f,g)); 
}
}
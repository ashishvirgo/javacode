import java.io.*;
class testMath{
public static void main(String arg[])throws IOException
{
   BufferedReader sc=new BufferedReader
           (new InputStreamReader(System.in));
   System.out.print("enter the number=");
   String s1=sc.readLine();
   int n=Integer.parseInt(s1);
   Math1 o1=new Math1();
   System.out.println("factoral="+o1.fact(n));
   System.out.println("Sum="+o1.sum(23,n));
   System.out.println("Cube="+o1.cube(n));
}
}
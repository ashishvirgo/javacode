import java.io.*;
class sumusinginteractive1{
    public static void main(String arg[])throws IOException{
	      BufferedReader br=new BufferedReader
		       (new InputStreamReader(System.in));
		  System.out.print("Enter the first number=");
	      int a=Integer.parseInt(br.readLine());
		  System.out.print("Enter the Second number=");
	      int b=Integer.parseInt(br.readLine());
		  int c=a+b;
		  System.out.println("a="+a);
		  System.out.println("b="+b);
		  System.out.println("c="+c);
	}
}
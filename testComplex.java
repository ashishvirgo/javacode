import java.util.Scanner;
class Complex{
     int real;
	 int imag;
	 Complex(){
	 real=0;
	 imag=0;
	 }
	 Complex(int r,int im){
	 real=r;
	 imag=im;
	 }
	 void addComplex(Complex c1,Complex c2){
		  real=c1.real+c2.real;
		  imag=c1.imag+c2.imag;
		  	 }
	 void mulComplex(Complex c1,Complex c2){
		  real=c1.real*c2.real-c1.imag*c2.imag;
		  imag=c1.real*c2.imag+c2.real*c1.imag;
		  	 }
	 void Display(){
		 System.out.println(real+"+i"+imag);
	 }
}
class testComplex{
	public static void main(String arg[]){
		Complex c1,c2,c3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first complex number real and imaginary=");
		int r=sc.nextInt();
		int im=sc.nextInt();
		System.out.println("enter Second complex number real and imaginary=");
		int r1=sc.nextInt();
		int im1=sc.nextInt();
		   c1=new Complex(r,im);
		   c2=new Complex(r1,im1);
		   c3=new Complex();
		   c1.Display();
		   c2.Display();
		   c3.addComplex(c1,c2);
		   System.out.println("sum of two complex number=");
		   c3.Display();
		   c3.mulComplex(c1,c2);
		   System.out.println("Multiplication of two complex number=");
		   c3.Display();
	}
}
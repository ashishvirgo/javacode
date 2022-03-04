class A
{
   int a,b;  //class variables
      A(){    //Default constructor
	   a=5;
	   b=6;
	  }
	  A(int a,int b)//Parameterized constructor
	  {
	    this.a=a;
		this.b=b;
	  }
	  A(A re){ //Copy constructor
		  a=re.a;
		  b=re.b;
	  }
	  void Display(){
		  System.out.println("a="+a+"b="+b);
	  }
}
class testconstructor{
public static void main(String arg[])
{
	A o1,o2,o3,o4;
	    o1=new A();
		o2=new A(7,8);
		o3=new A(o2);
		o1.Display();
		o2.Display();
		o3.Display();
		o4=o1;
		o4.Display();
}		
}
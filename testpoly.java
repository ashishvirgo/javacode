class math1{
    int add(int a,int b){
	   return (a+b);
	  }
	int add(int a,int b,int c){
	   return (a+b+c);
	  }
	  float add(float a,float b){
	   return (a+b);
	  }
	 double add(double a,double b){
	   return (a+b);
	  } 
}
class testpoly{
	public static void main(String ...arg){
		math1 o1=new math1();
		System.out.println("sum="+o1.add(2,3));
		System.out.println("sum="+o1.add(2.5,3,4));
		System.out.println("sum="+o1.add(2.5f,3.6f));
		System.out.println("sum="+o1.add(2.6,3.7));
	}
}
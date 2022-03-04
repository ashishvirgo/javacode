class datatypeex1
{
public static void main(String arg[])
{
 boolean bl=false;
 char ch='A';
 byte b=100;
 short s=4;
 float f=256.14F;
 b=(byte)(b*2);
 s=(short)(b*s);
 int i=(int)f;
 float j=ch*2;
 double d=f*3;
 System.out.println("bool="+bl);
 System.out.println("b="+b);
 System.out.println("s="+s);
 System.out.println("f="+f);
 System.out.println("i="+i);
 System.out.println("j="+j);
 System.out.println("d="+d);
}
}
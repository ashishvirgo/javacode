public class TestEx2 {
    public static void main(String arg[]){
        try{
            int a=8;
            int b=0;
            int c=a/b;
            System.out.println("a="+a);
            System.out.println("b="+b);
            System.out.println("c="+c);
        }
        catch(ArithmeticException e){
       System.out.println("change the value of b"+e);
        }
}
}

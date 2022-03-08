public class testEx1 {
    public static void main(String arg[]){
        int a=5;
        int b=0;
        try{
        int c=a/b;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Change the value of b"+e.getStackTrace());   
        }
    }
}

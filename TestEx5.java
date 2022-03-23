import java.nio.channels.ClosedSelectorException;

public class TestEx5 {
    public static void main(String arg[]) {
        try{
            String s1=null;
            System.out.println("length="+s1.length());
            String s2="adf";
            int a=Integer.parseInt(s2);
            System.out.println("a="+a);
        }
       
        catch(NumberFormatException e1){
            System.out.println("Number format exception"+e1);   
        }
        catch(NullPointerException e2){
            System.out.println("Null pointer exception"+e2);   
        }
        catch(Exception e){
            e.printStackTrace();
        } 
    }
}

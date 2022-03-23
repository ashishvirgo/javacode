public class TestEx3 {
    public static void main(String arg[]){
        try{
            int ars[]=new int[5];
            ars[0]=9;
            ars[5]=10;
            System.out.println(ars[5]);
            System.out.println("Inside TRY block");
        }
       catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("array index out of range"+e1);
            System.out.println("Inside catch block");
            System.exit(0);
        } 
        finally{
            System.out.println("Inside Finally block"); 
        }
    }
    
}

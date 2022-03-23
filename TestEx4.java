class ownException extends Exception{
    void Message(){
        System.out.println("voter age is less than 18");
    }
}
public class TestEx4 {
    public static void main(String arg[]){
         int age=14;
         try{
             if(age<18){
                 throw new ownException();
             }
             else{
                System.out.println("voter is valid");    
             }
            }
            catch(ownException e){
                e.Message();
            }
         }
    }


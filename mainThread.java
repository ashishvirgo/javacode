class tanx extends Thread{
    double degree;
    double res;
     tanx(double deg){
      degree=deg;
     }
     public void run(){
         double rad=Math.toRadians(degree);
         res=Math.tan(rad);
     }
}
class cosy extends Thread{
    double degree;
    double res;
     cosy(double deg){
      degree=deg;
     }
     public void run(){
         double rad=Math.toRadians(degree);
         res=Math.cos(rad);
     }
}
class sinz extends Thread{
    double degree;
    double res;
     sinz(double deg){
      degree=deg;
     }
     public void run(){
         double rad=Math.toRadians(degree);
         res=Math.sin(rad);
     }
}
class mainThread{
    public static void main(String arg[]){
        tanx t1=new tanx(45);
        sinz t2=new sinz(30);
        cosy t3=new cosy(60);
             t1.start();
             t2.start();
             t3.start();
             try{
             t1.join();
             t2.join();
             t3.join(); 
             double p=t1.res+t2.res+t3.res;
             System.out.print("p="+p);
            }
             catch(InterruptedException e){
                 e.printStackTrace();
             } 
    }
}
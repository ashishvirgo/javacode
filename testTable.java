public class testTable {
    public static void main(String arg[]){
        table3 t1=new table3(3);
        table5 t2=new table5(5);
        t1.start();
        t2.start();
    }
}
class table3 extends Thread{
    int num;
    table3(int n){
        num=n;
    }
    public void run(){
        Table.printTable(num);
    }
}
class table5 extends Thread{
    int num;
    table5(int n){
        num=n;
    }
    public void run(){
        Table.printTable(num);
    }
}
class Table{
    synchronized static void printTable(int n){
        for(int i=1;i<=10;i++)
        System.out.println(n+"*"+i+"="+(n*i));
    }
}
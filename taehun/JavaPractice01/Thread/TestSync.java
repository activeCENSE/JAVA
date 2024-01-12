package JavaPractice01.Thread;

class Printer{
    synchronized void print(int[] arr) throws InterruptedException {
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
            Thread.sleep(100);
        }
    }
}

class MyThread1 extends Thread {
    Printer ptn;
    int[] myarr = {10,20,30,40,50};

    MyThread1(Printer ptn){
        this.ptn = ptn;
    }
    public void run(){
        try{
            ptn.print(myarr);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class MyThread2 extends Thread {
    Printer ptn;
    int[] myarr = {60,70,80,90,100};

    MyThread2(Printer ptn){
        this.ptn = ptn;
    }
    public void run(){
        try{
            ptn.print(myarr);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class TestSync {
    public static void main(String[] args) {
        Printer obj = new Printer();


    }
}

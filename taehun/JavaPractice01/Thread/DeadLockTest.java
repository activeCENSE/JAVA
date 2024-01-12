package JavaPractice01.Thread;

public class DeadLockTest {
  public static void main(String[] args) {  
    final String res1 = "Gold";  
    final String res2 = "Silver";  

    Thread t1 = new Thread(()-> {  
        synchronized (res1) {
         System.out.println("Thread 1: get res1");
         try { Thread.sleep(100);} catch (Exception e) {}  
         synchronized (res2) {  
          System.out.println("Thread 1: get res2");
         }
            System.out.println("t1 종료");
    }});  

    Thread t2 = new Thread(()-> {  
        synchronized (res1) {
         System.out.println("Thread 2: get res1");
         try { Thread.sleep(100);} catch (Exception e) {}  
         synchronized (res2) {
          System.out.println("Thread 2: get res2");
         }
            System.out.println("t2 종료");
    }});  
  
    t1.start();  
    t2.start();
  }  
} 
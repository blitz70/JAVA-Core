package center.wiz.java3.java29_thread;

public class MainClass3 {

  public static void main(String[] args) {
    ThreadTest3 threadTest3 = new ThreadTest3();
    Thread thread1 = new Thread(threadTest3, "A");
    Thread thread2 = new Thread(threadTest3, "B");
    thread1.start();
    thread2.start();
    System.out.println("MainClass3 : " + Thread.currentThread().getName());
  }

}
package center.wiz.java3.java29_thread;

public class MainClass3 {

  public static void main(String[] args) {
    //1 thread -> 1 object
    ThreadTest test1 = new ThreadTest();
    ThreadTest test2 = new ThreadTest();
    Thread thread1 = new Thread(test1, "A");
    Thread thread2 = new Thread(test2, "B");
    thread1.start();
    thread2.start();
    System.out.println("MainClass3 : " + Thread.currentThread().getName());
  }

}
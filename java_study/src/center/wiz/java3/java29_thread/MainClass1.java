package center.wiz.java3.java29_thread;

public class MainClass1 {

  public static void main(String[] args) {
    ThreadTest1 threadTest1 = new ThreadTest1();
    Thread thread = new Thread(threadTest1, "A");
    thread.start();
    System.out.println("MainClass1 : " + Thread.currentThread().getName());
  }

}
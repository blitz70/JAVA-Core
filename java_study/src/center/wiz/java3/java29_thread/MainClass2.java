package center.wiz.java3.java29_thread;

public class MainClass2 {

  public static void main(String[] args) {
    //many threads -> 1 object
    ThreadTest test = new ThreadTest();
    Thread thread1 = new Thread(test, "A");
    Thread thread2 = new Thread(test, "B");
    thread1.start();
    thread2.start();
    System.out.println("MainClass2 : " + Thread.currentThread().getName());
  }

}
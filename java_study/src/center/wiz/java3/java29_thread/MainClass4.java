package center.wiz.java3.java29_thread;

public class MainClass4 {

  public static void main(String[] args) {
    //many threads -> 1 object synchronized
    ThreadTest4 test = new ThreadTest4();
    Thread thread1 = new Thread(test, "A");
    Thread thread2 = new Thread(test, "B");
    thread1.start();
    thread2.start();
    System.out.println("MainClass4 : " + Thread.currentThread().getName());
  }

}
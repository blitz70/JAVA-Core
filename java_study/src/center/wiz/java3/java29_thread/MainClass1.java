package center.wiz.java3.java29_thread;

public class MainClass1 {

  public static void main(String[] args) {
    //Runnable interface
    ThreadTest1A threadTest1A = new ThreadTest1A();
    Thread thread = new Thread(threadTest1A, "A");
    thread.start();
    
    //Thread inheritance
    ThreadTest1B threadTest1B = new ThreadTest1B();
    threadTest1B.setName("B");
    threadTest1B.start();

    System.out.println("MainClass1 : " + Thread.currentThread().getName());
  }

}
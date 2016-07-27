package center.wiz.java3.java29_thread;

public class ThreadTest1A implements Runnable {

  @Override
  public void run() {
    System.out.println("ThreadTest!A : " + Thread.currentThread().getName());
    for (int i = 0; i < 10; i++) {
      System.out.println("" +i);
      try {
        Thread.sleep(500);
      } catch (Exception e) {
      }
    }
  }

}

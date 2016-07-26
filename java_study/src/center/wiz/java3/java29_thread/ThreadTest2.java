package center.wiz.java3.java29_thread;

public class ThreadTest2 extends Thread {

  @Override
  public void run() {
    System.out.println("ThreadTest2 : " + Thread.currentThread().getName());
    for (int i = 0; i < 10; i++) {
      System.out.print(i + " ");
      try {
        Thread.sleep(500);
      } catch (Exception e) {
      }
    }
  }

}

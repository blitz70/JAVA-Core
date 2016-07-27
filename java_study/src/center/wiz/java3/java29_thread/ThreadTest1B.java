package center.wiz.java3.java29_thread;

public class ThreadTest1B extends Thread {

  @Override
  public void run() {
    System.out.println("ThreadTest1B : " + Thread.currentThread().getName());
    for (int i = 0; i < 10; i++) {
      System.out.println("            " +i);
      try {
        Thread.sleep(500);
      } catch (Exception e) {
      }
    }
  }

}

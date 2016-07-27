package center.wiz.java3.java29_thread;

public class ThreadTest implements Runnable {
  
  int testNum = 0;

  @Override
  public void run() {
    System.out.println("ThreadTest2 : " + Thread.currentThread().getName());
    for (int i = 0; i < 10; i++) {
      if (Thread.currentThread().getName().equals("A")) {
        System.out.println("=========================");
        testNum++;
      }
      System.out.println("Thread name : " + Thread.currentThread().getName() + ", testNum : " + testNum);
      try {
        Thread.sleep(500);
      } catch (Exception e) {
      }
    }
  }

}

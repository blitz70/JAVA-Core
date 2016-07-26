package center.wiz.java3.java29_thread;

public class MainClass2 {

  public static void main(String[] args) {
    ThreadTest2 threadTest2 = new ThreadTest2();
    threadTest2.setName("B");
    threadTest2.start();
    System.out.println("MainClass1 : " + Thread.currentThread().getName());
  }

}
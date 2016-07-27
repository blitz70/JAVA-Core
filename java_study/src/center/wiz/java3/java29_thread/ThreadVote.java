package center.wiz.java3.java29_thread;

import java.util.Random;

public class ThreadVote implements Runnable {

  int targetVote = 100;
  int currentVote = 0;
  StringBuffer currentVoteBar = new StringBuffer();
  //String currentVoteBar = "";
  Random random = new Random();
  
  @Override
  public void run() {
    while (true) {
      currentVoteBar.delete(0, currentVoteBar.toString().length());
     // currentVoteBar = "";
      currentVote += random.nextInt(10);
      if (currentVote > targetVote) {
        currentVote = targetVote;
      }
      for (int i = 0; i < currentVote; i++) {
        currentVoteBar.append("*");
        //currentVoteBar +="*";
      }
      System.out.println(Thread.currentThread().getName() + "\t" + currentVote + "%\t" + currentVoteBar);
      if (currentVote == targetVote) break;
      try {
        Thread.sleep(200);
      } catch (Exception e) {
      }
    }
  }
}

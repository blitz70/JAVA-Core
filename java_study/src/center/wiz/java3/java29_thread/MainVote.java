package center.wiz.java3.java29_thread;

public class MainVote {

  public static void main(String[] args) {
    ThreadVote threadVote1 = new ThreadVote();
    ThreadVote threadVote2 = new ThreadVote();
    ThreadVote threadVote3 = new ThreadVote();
    ThreadVote threadVote4 = new ThreadVote();
    ThreadVote threadVote5 = new ThreadVote();
    Thread vote1 = new Thread(threadVote1, "A");
    Thread vote2 = new Thread(threadVote2, "B");
    Thread vote3 = new Thread(threadVote2, "C");
    Thread vote4 = new Thread(threadVote3, "D");
    Thread vote5 = new Thread(threadVote4, "E");
    vote1.start();
    vote2.start();
    vote3.start();
    vote4.start();
    vote5.start();
  }

}
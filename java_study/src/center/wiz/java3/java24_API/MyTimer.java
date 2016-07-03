package center.wiz.java3.java24_API;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {

	static long t, t0;

	public MyTimer() throws InterruptedException {
		
		t0 = System.currentTimeMillis();
		
		System.out.println("*************");
		TimerTask t1 = new MyTask1();
		TimerTask t2 = new MyTask2();
		Timer timer = new Timer(true);
		timer.schedule(t1, 2000);		//2s 후 실행
		t = System.currentTimeMillis();
		System.out.println("1 : " + (t-t0));
		timer.schedule(t2, 10000);		//10s 후 실행
		t = System.currentTimeMillis();
		System.out.println("3 : " + (t-t0));
		Thread.sleep(11000);			//11s 동안 정지
		t = System.currentTimeMillis();
		System.out.println("5 : " + (t-t0));
		System.out.println("========");

	}
	
}

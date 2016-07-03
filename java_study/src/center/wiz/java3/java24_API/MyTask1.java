package center.wiz.java3.java24_API;

import java.util.TimerTask;

public class MyTask1 extends TimerTask{

	@Override
	public void run() {
		long t, t0;
		t0 = MyTimer.t0;
		System.out.println("MyTask1 : Working");
		t = System.currentTimeMillis();
		System.out.println("2 : " + (t-t0));
	}

}

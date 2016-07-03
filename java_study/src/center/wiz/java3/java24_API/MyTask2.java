package center.wiz.java3.java24_API;

import java.util.TimerTask;

public class MyTask2 extends TimerTask{

	@Override
	public void run() {
		long t, t0;
		t0 = MyTimer.t0;
		System.out.println("MyTask2 : Working");
		t = System.currentTimeMillis();
		System.out.println("4 : " + (t-t0));
	}

}

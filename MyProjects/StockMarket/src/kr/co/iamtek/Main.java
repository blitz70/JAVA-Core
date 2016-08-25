package kr.co.iamtek;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {

//		Download d = new Download();
//		d.today();
//		GregorianCalendar start = new GregorianCalendar(2000, 1, 1);
//		d.setStart(start);
//		d.start();
			//Downloader d = new Downloader("IBM", "1962-01-02", "2016-08-25");
		Downloader d = new Downloader();
			//d.info();
			d.get();
	}

}

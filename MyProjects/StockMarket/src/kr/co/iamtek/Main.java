package kr.co.iamtek;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {

//		Download d = new Download();
//		d.today();
//		GregorianCalendar start = new GregorianCalendar(2000, 1, 1);
//		d.setStart(start);
//		d.start();
			Download d = new Download("abc", "2000-01-01", "2016-08-21");
			d.dates();
	}

}

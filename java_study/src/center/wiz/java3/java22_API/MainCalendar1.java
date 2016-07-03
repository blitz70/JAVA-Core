package center.wiz.java3.java22_API;

import java.util.Calendar;

public class MainCalendar1 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();		//Singleton class
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MARCH);
		int second = cal.get(Calendar.SECOND);
 		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.println(hour + "시 " + minute + "분" + second + "초");

	}

}

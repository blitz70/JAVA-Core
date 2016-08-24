package kr.co.iamtek;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Download {

	private String stock;
	private GregorianCalendar start;
	private GregorianCalendar end;
	
	public Download() {
		super();
	}
	public Download(String stock, String start, String end) {
		super();
		this.stock = stock;
		//convert sting date to calendar date
		String[] _start = start.split("-");
		String[] _end = end.split("-");
		this.start = new GregorianCalendar(
				Integer.parseInt(_start[0]), Integer.parseInt(_start[1])-1, Integer.parseInt(_start[2])
				);
		this.end = new GregorianCalendar(
				Integer.parseInt(_end[0]), Integer.parseInt(_end[1])-1, Integer.parseInt(_end[2])
				);
	}
	public Download(String stock, GregorianCalendar start, GregorianCalendar end) {
		super();
		this.stock = stock;
		this.start = start;
		this.end = end;
	}

	public void dates() {
		Calendar date = Calendar.getInstance();
		System.out.println("Today : " + date.get(Calendar.YEAR)+"-"+(date.get(Calendar.MONTH)+1)+"-"+date.get(Calendar.DAY_OF_MONTH));
		date = start;
		System.out.println("Start : " + date.get(Calendar.YEAR)+"-"+(date.get(Calendar.MONTH)+1)+"-"+date.get(Calendar.DAY_OF_MONTH));
		date = end;
		System.out.println("End : " + date.get(Calendar.YEAR)+"-"+(date.get(Calendar.MONTH)+1)+"-"+date.get(Calendar.DAY_OF_MONTH));
	}

	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public GregorianCalendar getStart() {
		return start;
	}
	public void setStart(GregorianCalendar start) {
		this.start = start;
	}
	public GregorianCalendar getEnd() {
		return end;
	}
	public void setEnd(GregorianCalendar end) {
		this.end = end;
	}

}

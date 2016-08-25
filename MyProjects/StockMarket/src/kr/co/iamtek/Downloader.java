package kr.co.iamtek;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Downloader {

	private String stockId = null;
	private GregorianCalendar start = null;
	private GregorianCalendar end = null;
	
	public void get() {
		
		//network
		String line;
		URL url;
		URLConnection con;
		BufferedReader in = null;
		FileWriter out = null;
		
		if ((stockId ==null) || (start == null) || (end == null)) {
			System.out.println("No download instructions");
		} else {
			/*
			GregorianCalendar date = new GregorianCalendar();
			Double open = null;
			Double high = null;
			Double low = null;
			Double close = null;
			int volume = 0;
			Double adjclose = null;

			//1day data
			ArrayList<Object> dayData = null;
			dayData.add(date);
			dayData.add(open);
			dayData.add(high);
			dayData.add(low);
			dayData.add(close);
			dayData.add(volume);
			dayData.add(adjclose);
			
			//data from start to end
			ArrayList<Object> data = null;
			data.add(dayData);
			*/
			//http://chart.finance.yahoo.com/table.csv?s=IBM&a=0&b=2&c=1962&d=7&e=25&f=2016&g=d&ignore=.csv
			//http://chart.finance.yahoo.com/table.csvt?IBM&a=0&b=2&c=1962&d=7&e=25&f=2016&g=d&ignore=.cs
			String url_download = "http://chart.finance.yahoo.com/table.csv?s=" + stockId +
					"&a=" + start.get(Calendar.MONTH) +
					"&b=" + start.get(Calendar.DAY_OF_MONTH) +
					"&c=" + start.get(Calendar.YEAR) +
					"&d=" + end.get(Calendar.MONTH) +
					"&e=" + end.get(Calendar.DAY_OF_MONTH) +
					"&f=" + end.get(Calendar.YEAR) +
					"&g=d&ignore=.csv";
			try {
				url = new URL(url_download);
				con = url.openConnection();
				in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				out = new FileWriter("C:\\stock.csv", false);
				while ((line = in.readLine()) != null) {
					out.write(line);
				}
			} catch (Exception e) {
				System.out.println("Downloader.get()");
				e.printStackTrace();
			} finally {
				try {
					if (in != null) in.close();
					if (out != null) out.close();
				} catch (Exception e2) {
				}
				
			}
		}
	
	}
	
	public GregorianCalendar formatDate(String date) {
		//convert date from string to Gregorian
		String[] _date = date.split("-");
		return new GregorianCalendar(
				Integer.parseInt(_date[0]), Integer.parseInt(_date[1])-1, Integer.parseInt(_date[2])
				);
	}
	
	public void info() {
		System.out.println("Stock : " + stockId);
		Calendar date = Calendar.getInstance();
		System.out.println("Today : " + date.get(Calendar.YEAR)+"-"+(date.get(Calendar.MONTH)+1)+"-"+date.get(Calendar.DAY_OF_MONTH));
		date = start;
		System.out.println("Start : " + date.get(Calendar.YEAR)+"-"+(date.get(Calendar.MONTH)+1)+"-"+date.get(Calendar.DAY_OF_MONTH));
		date = end;
		System.out.println("End : " + date.get(Calendar.YEAR)+"-"+(date.get(Calendar.MONTH)+1)+"-"+date.get(Calendar.DAY_OF_MONTH));
	}

	public Downloader(String stockId, String start, String end) {
		super();
		this.stockId = stockId;
		this.start = formatDate(start);
		this.end = formatDate(end);
	}

	public Downloader() {
		super();
	}
	public Downloader(String stockId, GregorianCalendar start, GregorianCalendar end) {
		super();
		this.stockId = stockId;
		this.start = start;
		this.end = end;
	}
	public String getStock() {
		return stockId;
	}
	public void setStock(String stock) {
		this.stockId = stock;
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

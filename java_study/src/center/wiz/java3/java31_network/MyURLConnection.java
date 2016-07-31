package center.wiz.java3.java31_network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class MyURLConnection {
  
	String data;
  Scanner scanner;
  String address;
	URL url;
	URLConnection con;
	BufferedReader webData;
	FileWriter fileData;
	
  public MyURLConnection() {
    System.out.println("웹 주소를 입력 하세요.");
    scanner = new Scanner(System.in);
    address = scanner.next();
    
    try {
			url = new URL(address);
			con = url.openConnection();
			webData =  new BufferedReader(new InputStreamReader(con.getInputStream()));
			fileData = new FileWriter("C:\\Users\\Administrator\\Desktop\\CODE\\GIT\\java\\java_study\\file.html", false);
			while ((data = webData.readLine()) != null) {
				fileData.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (webData != null) webData.close();
				if (fileData != null) fileData.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
    
    
	}

}

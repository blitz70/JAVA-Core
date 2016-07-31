package center.wiz.java3.java31_network;

import java.net.InetAddress;
import java.util.Scanner;

public class MyInetAddress {
	
	Scanner scanner;
	
	public MyInetAddress() {
		System.out.println("Host 이름을 입력 하세요.");
		while (true) {
			scanner = new Scanner(System.in);
			String name = scanner.next();
			if (name.equals("exit")) {
				break;
			} else {
				try {
					InetAddress inetAddress = InetAddress.getByName(name);
					System.out.println("Computer name : " + inetAddress.getHostName());
					System.out.println("Computer IP : " + inetAddress.getHostAddress());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}

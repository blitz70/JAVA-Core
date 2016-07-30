package center.wiz.java3.java30_gui;

import java.awt.Dimension;

public class MainAWT1 {

	public static void main(String[] args) {
		CompButton btn = new CompButton();
		btn.setSize(new Dimension(200, 200));	//크기 지정
		btn.setVisible(true);	//화면에 출력
		try {
			Thread.sleep(5000);
		} catch (Exception e) {}
		btn.setVisible(false);	//화면에서 숨김
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		btn.pack();	//최소 크기
		btn.setVisible(true);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {}
		btn.setVisible(false);
		btn.dispose();	//자원 해제
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		System.exit(0);		//app 종료
	}

}

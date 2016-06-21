package kr.co.iamtek;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {	//웹어플 종료시 실행
		System.out.println("contextDestroyed");

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {	//웹어플 시작시 실행
		System.out.println("contextInitialized");

	}

}

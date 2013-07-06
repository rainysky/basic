package com.rainy.mini.core.systeminit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 
 * 
 * 系统初始化
 * 
 * @author 张冰冰
 * @since 1.0
 * @version 2013-6-28 张冰冰
 */
public class ServerInitListener implements ServletContextListener {

	/**
	 * 
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

	/**
	 * 
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		EnviromentInfo.setServletContext(arg0.getServletContext());
		EnviromentInfo.init();
	}

}

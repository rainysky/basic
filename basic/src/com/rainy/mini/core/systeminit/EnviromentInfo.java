package com.rainy.mini.core.systeminit;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;

/**
 * 
 * 服务初始化
 * 
 * @author 张冰冰
 * @since 1.0
 * @version 2013-6-24 张冰冰
 */
public class EnviromentInfo {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(EnviromentInfo.class);
	private static final String LOG_CONFIG_LOCATION = "logbackConfigLocation";
	private static ServletContext servletContext;
	private static WebApplicationContext ctx;

	/**
	 * 
	 * 初始化加载
	 */
	public static void init() {
		// 先初始化日志服务
		initLog();
		LOGGER.debug("启动服务，开始初始化服务……");
		LOGGER.debug("启动服务，初始化服务完成");
	}

	private static void initLog() {
		// 从web.xml中加载指定文件名的日志配置文件
		String logbackConfigLocation = getServletContext().getInitParameter(
				LOG_CONFIG_LOCATION);
		String fn = getServletContext().getRealPath(logbackConfigLocation);
		try {
			LoggerContext loggerContext = (LoggerContext) LoggerFactory
					.getILoggerFactory();
			loggerContext.reset();
			JoranConfigurator joranConfigurator = new JoranConfigurator();
			joranConfigurator.setContext(loggerContext);
			joranConfigurator.doConfigure(fn);
			LOGGER.debug("loaded slf4j configure file from {}", fn);
		} catch (JoranException e) {
			LOGGER.error("cann't loading slf4j configure file from " + fn, e);
		}
	}

	/**
	 * @return 获取 servletContext属性值
	 */
	public static ServletContext getServletContext() {
		return servletContext;
	}

	/**
	 * @param servletContext 设置 servletContext 属性值为参数值 servletContext
	 */
	public static void setServletContext(ServletContext servletContext) {
		EnviromentInfo.servletContext = servletContext;
	}

	/**
	 * @return 获取 ctx属性值
	 */
	public static WebApplicationContext getCtx() {
		if (ctx == null) {
			ctx = WebApplicationContextUtils
					.getRequiredWebApplicationContext(servletContext);
		}
		return ctx;
	}

	/**
	 * @param ctx 设置 ctx 属性值为参数值 ctx
	 */
	public static void setCtx(WebApplicationContext ctx) {
		EnviromentInfo.ctx = ctx;
	}

}

package com.rainy.mini.test;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 测试sfl4j日志打印
 * 
 * @author 张冰冰
 * @since 1.0
 * @version 2013-7-1 张冰冰
 */
public class TestSfl4j {
	/**
	 * FIXME 方法注释信息(此标记自动完成,注释填写完成后请删除)
	 * 
	 * <pre>
	 * 
	 * </pre>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(TestSfl4j.class);
		logger.info("test Sfl4j");
		logger.error("发生异常，时间为{}", new Date());
		logger.debug("启动服务，开始初始化服务……");
		logger.debug("启动服务，初始化服务完成");
		logger.info("启动服务，初始化服务完成");
		logger.info("启动服务，初始化服务完成");
	}
}

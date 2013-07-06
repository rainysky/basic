/******************************************************************************
 *本软件为zbb个人开发研制。 未经本人正式书面同意，其他任何个人、
 * 团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.rainy.mini.base.exception;

/**
 * 
 * 异常基类
 * 
 * @author 张冰冰
 * @since 1.0
 * @version 2013-7-2 张冰冰
 */
public class BaseException extends RuntimeException {
	/**  */
	private static final long serialVersionUID = -9214622269246817272L;

	/**
	 * 
	 * 构造函数
	 * 
	 * @param message 异常信息
	 * @param throwable 异常
	 */
	public BaseException(String message, Throwable throwable) {
		super(message, throwable);
	}
}

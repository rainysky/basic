/******************************************************************************
 *本软件为zbb个人开发研制。 未经本人正式书面同意，其他任何个人、
 * 团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.rainy.mini.base.model;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

/**
 * 
 * 基类VO
 * 
 * @author 张冰冰
 * @since 1.0
 * @version 2013-7-2 张冰冰
 */
@MappedSuperclass
public class BaseVO implements Serializable {

	/**  */
	private static final long serialVersionUID = 6508513473874519728L;

	/** 页码 */
	@Transient
	protected int page = 1;

	/** 每页大小 */
	@Transient
	protected int rows = 15;

	/** 排序字段 */
	@Transient
	protected String sort;

	/** 排序方式 */
	@Transient
	protected String order;

	/**
	 * @return 页码
	 */
	public int getPage() {
		return page;
	}

	/**
	 * @param page 页码
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * @return 每页大小
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * @param rows 每页大小
	 */
	public void setRows(int rows) {
		this.rows = rows;
	}

	/**
	 * @return 获取 sort属性值
	 */
	public String getSort() {
		return sort;
	}

	/**
	 * @param sort 设置 sort 属性值为参数值 sort
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}

	/**
	 * @return 获取 order属性值
	 */
	public String getOrder() {
		return order;
	}

	/**
	 * @param order 设置 order 属性值为参数值 order
	 */
	public void setOrder(String order) {
		this.order = order;
	}

}

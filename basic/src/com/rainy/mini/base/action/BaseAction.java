/******************************************************************************
 *本软件为zbb个人开发研制。 未经本人正式书面同意，其他任何个人、
 * 团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.rainy.mini.base.action;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * 基类 Action
 * 
 * @author 张冰冰
 * @since 1.0
 * @version 2013-7-6 张冰冰
 */
public class BaseAction extends ActionSupport {
	/**  */
	private static final long serialVersionUID = -4951928003993761752L;

	// /** 页码 */
	// protected int page;
	//
	// /** 每页记录数 */
	// protected int rows;

	/** 名称 */
	protected String name;

	/** 结果集合 */
	public final String ROWS = "rows";

	/** 总记录数 */
	public final String TOTAL = "total";

	/** 结果集 */
	protected JSONObject resultObj;

	// /** 排序字段 */
	// public String sort;
	//
	// public String order;

	/** 操作结果存放形式 */
	protected Map<String, Object> map = new HashMap<String, Object>();

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	/**
	 * 获取 ActionContext对象
	 * 
	 * @return ActionContext对象
	 */
	protected ActionContext getActionContext() {
		return ActionContext.getContext();
	}

	/**
	 * 获取Session对象
	 * 
	 * @return Session对象
	 */
	protected Map<String, Object> getSession() {
		return getActionContext().getSession();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return 获取 resultObj属性值
	 */
	public JSONObject getResultObj() {
		return resultObj;
	}

	/**
	 * @param resultObj 设置 resultObj 属性值为参数值 resultObj
	 */
	public void setResultObj(JSONObject resultObj) {
		this.resultObj = resultObj;
	}

	/**
	 * 将Objec对象转换为JSONObject对象
	 * 
	 * @param object 需要转换的对象
	 * @return 转换后的对象
	 */
	public JSONObject objectToJsonObject(Object object) {
		return JSON.parseObject(JSON.toJSONString(object));
	}

	/**
	 * 对象转换为JSON数组
	 * 
	 * @param object 需转换的对象
	 * @return 转换后的数组集合
	 */
	public JSONArray objectToJsonArray(Object object) {
		return JSON.parseArray(JSON.toJSONString(object));
	}

}

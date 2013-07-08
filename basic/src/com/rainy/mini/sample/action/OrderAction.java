/******************************************************************************
 *本软件为zbb个人开发研制。 未经本人正式书面同意，其他任何个人、
 * 团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.rainy.mini.sample.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ModelDriven;
import com.rainy.mini.base.action.BaseAction;
import com.rainy.mini.sample.model.Order;
import com.rainy.mini.sample.service.OrderService;

/**
 * 订单Action
 * 
 * @author 张冰冰
 * @since 1.0
 * @version 2013-7-6 张冰冰
 */
@ParentPackage("json-package")
@Namespace("/sample")
public class OrderAction extends BaseAction implements ModelDriven<Order> {
	/**  */
	private static final long serialVersionUID = -239638008247442823L;
	private static final Logger LOGGER = LoggerFactory
			.getLogger(OrderAction.class);

	private final Order order = new Order();

	@Resource
	private OrderService orderService;

	@Action(value = "preSelect", results = { @Result(name = "success", location = "/sample/select.jsp") })
	public String preSelect() {
		return SUCCESS;
	}

	@Action(value = "selectGrid", results = { @Result(name = "success", params = {
			"root", "resultObj" }, type = "json") })
	public String selectGrid() {
		LOGGER.info("排序字段sort:{}", order.getSort());
		List<Order> lstOrders = orderService.selectPage(order);
		int count = orderService.count(order);
		map.put(ROWS, objectToJsonArray(lstOrders));
		map.put(TOTAL, count);
		resultObj = objectToJsonObject(map);
		return SUCCESS;
	}

	@Override
	public Order getModel() {
		return order;
	}

}

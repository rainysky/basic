/******************************************************************************
 *本软件为zbb个人开发研制。 未经本人正式书面同意，其他任何个人、
 * 团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.rainy.mini.sample.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rainy.mini.base.dao.IBaseDAO;
import com.rainy.mini.sample.model.Order;

/**
 * 
 * 订单
 * 
 * @author 张冰冰
 * @since 1.0
 * @version 2013-7-4 张冰冰
 */
@Service
public class OrderService {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(OrderService.class);
	@Resource(name = "baseDAOImpl")
	private IBaseDAO iBaseDAO;

	/**
	 * 
	 * 分页查询
	 * 
	 * @param order 订单
	 * @return 订单集合
	 */
	public List<Order> selectPage(Order order) {
		LOGGER.info("执行OrderService.selectPage方法，参数order:" + order);
		return iBaseDAO.queryList("sample.order.select", order,
				order.getPage(), order.getRows());
	}

	public Integer count(Order order) {
		return iBaseDAO.count("sample.order.count", order);
	}
}

/******************************************************************************
 *本软件为zbb个人开发研制。 未经本人正式书面同意，其他任何个人、
 * 团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.rainy.mini.sample.service;

import java.util.List;

import javax.annotation.Resource;

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

	@Resource(name = "baseDAOImpl")
	private IBaseDAO iBaseDAO;

	public List<Order> select(Order order) {
		return iBaseDAO.queryList("sample.order.select", order);
	}
}

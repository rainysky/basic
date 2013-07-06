/******************************************************************************
 *本软件为zbb个人开发研制。 未经本人正式书面同意，其他任何个人、
 * 团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.rainy.mini.sample;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rainy.mini.sample.model.Order;
import com.rainy.mini.sample.service.OrderService;

/**
 * 
 * 测试订单
 * 
 * @author 张冰冰
 * @since 1.0
 * @version 2013-7-4 张冰冰
 */
public class OrderTest {

	static ClassPathXmlApplicationContext ctx = null;

	@BeforeClass
	public static void setUp() throws Exception {
		try {
			String[] configLocation = { "classpath*:applicationContext-*.xml" };
			ctx = new ClassPathXmlApplicationContext(configLocation);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@AfterClass
	public static void tearDown() throws Exception {
		ctx.destroy();
	}

	@Test
	public void testSelect() {
		Order order = new Order();
		order.setPkid("12381132");
		OrderService orderService = (OrderService) ctx.getBean("orderService");
		List<Order> lstOrders = orderService.select(order);
		System.out.println(lstOrders.get(0).getMerchantName());
	}
}

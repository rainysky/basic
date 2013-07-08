/******************************************************************************
 *本软件为zbb个人开发研制。 未经本人正式书面同意，其他任何个人、
 * 团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.rainy.mini.base.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.rainy.mini.base.model.BaseVO;

/**
 * 
 * 基类服务DAO
 * 
 * @author 张冰冰
 * @since 1.0
 * @version 2013-7-2 张冰冰
 */
public interface IBaseDAO {
	/**
	 * 查询全部数据
	 * 
	 * @param <T> 泛型
	 * @param type 方法名
	 * @param object 查询参数
	 * @return 结果集
	 */
	<T extends BaseVO> List<T> queryList(String type, Object object);

	/**
	 * 根据参数对象删除数据
	 * 
	 * @param type 模块类型
	 * @param object 主键对象
	 */
	void delete(String type, Object object);

	/**
	 * 根据参数对象新增数据
	 * 
	 * @param type 模块类型
	 * @param object 主键对象
	 */
	void insert(String type, Object object);

	/**
	 * 根据参数对象新增数据
	 * 
	 * @param <T> 操作数据VO类型,BaseVO的实现类
	 * @param type 模块类型
	 * @param object 主键对象
	 */
	<T extends BaseVO> void insert(String type, T object);

	/**
	 * 根据参数对象批量新增数据
	 * 
	 * @param <T> 操作数据VO类型,BaseVO的实现类
	 * @param type 模块类型
	 * @param entities 待新增对象集合
	 */
	<T extends BaseVO> void insertBatch(final String type,
			final Collection<T> entities);

	/**
	 * 根据参数对象删除数据
	 * 
	 * @param type 模块类型
	 * @param object 主键对象
	 */
	void update(String type, Object object);

	/**
	 * 根据参数对象删除数据
	 * 
	 * @param <T> 操作数据VO类型,BaseVO的实现类
	 * @param type 模块类型
	 * @param object 主键对象
	 */
	<T extends BaseVO> void update(String type, T object);

	/**
	 * 根据参数对象批量更新数据
	 * 
	 * @param <T> 操作数据VO类型,BaseVO的实现类
	 * @param type 模块类型
	 * @param entities 待更新对象集合
	 */
	<T extends BaseVO> void updateBatch(final String type,
			final Collection<T> entities);

	/**
	 * 根据参数对象读取数据
	 * 
	 * @param type 模块类型
	 * @param object 参数对象
	 * @return 返回结果
	 */
	Object getObject(String type, Object object);

	/**
	 * 分页查询全部数据
	 * 
	 * @param <T> 泛型
	 * @param type 模块类型
	 * @param object 参数对象
	 * @param pageNo 当前页数
	 * @param pageSize 每页显示记录数
	 * @return List 返回结果集合
	 */
	<T extends Serializable> List<T> queryList(String type, Object object,
			int pageNo, int pageSize);

	/**
	 * 
	 * 查询记录数
	 * 
	 * @param <T> VO对象
	 * @param type sql
	 * @param t 查询参数
	 * @return 记录数
	 */
	<T extends BaseVO> int count(String type, T t);
}

/******************************************************************************
 *本软件为zbb个人开发研制。 未经本人正式书面同意，其他任何个人、
 * 团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.rainy.mini.base.dao;

import java.sql.SQLException;
import java.util.Collection;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionCallback;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.rainy.mini.base.exception.DAOException;
import com.rainy.mini.base.model.BaseVO;

/**
 * 
 * DAO 的实现
 * 
 * @author 张冰冰
 * @since 1.0
 * @version 2013-7-2 张冰冰
 */
@Service
public class BaseDAOImpl extends MyBatisDAO implements IBaseDAO {
	/**
	 * 根据参数对象批量新增数据
	 * 
	 * @param <T> 操作数据VO类型,BaseVO的实现类
	 * @param type 模块类型
	 * @param entities 待新增对象集合
	 */
	@Override
	public <T extends BaseVO> void insertBatch(final String type,
			final Collection<T> entities) {
		try {

			sqlSessionTemplate.execute(new SqlSessionCallback<Collection<T>>() {

				public Collection<T> doInSqlSession(SqlSession sqlSession)
						throws SQLException {
					for (T objT : entities) {
						sqlSession.insert(type, objT);
					}
					return entities;
				}

			});
		} catch (DataAccessException objException) {
			throw new DAOException("根据参数对象批量数据失败,参数列表(type:" + type
					+ " object:" + entities + ")", objException);
		}
	}

	/**
	 * 根据参数对象批量更新数据
	 * 
	 * @param <T> 操作数据VO类型,BaseVO的实现类
	 * @param type 模块类型
	 * @param entities 待更新对象集合
	 */
	@Override
	public <T extends BaseVO> void updateBatch(final String type,
			final Collection<T> entities) {
		try {

			sqlSessionTemplate.execute(new SqlSessionCallback<Collection<T>>() {

				@Override
				public Collection<T> doInSqlSession(SqlSession sqlSession)
						throws SQLException {
					for (T objT : entities) {
						sqlSession.update(type, objT);
					}
					return entities;
				}

			});
		} catch (DataAccessException objException) {
			throw new DAOException("根据参数对象批量数据失败,参数列表(type:" + type
					+ " object:" + entities + ")", objException);
		}

	}
}

/******************************************************************************
 *本软件为zbb个人开发研制。 未经本人正式书面同意，其他任何个人、
 * 团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.rainy.mini.base.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionCallback;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.rainy.mini.base.exception.DAOException;
import com.rainy.mini.base.model.BaseVO;

/**
 * 
 * MyBatis 的DAO实现
 * 
 * @author 张冰冰
 * @since 1.0
 * @version 2013-7-2 张冰冰
 */
@Repository
@Scope("prototype")
public class MyBatisDAO implements IBaseDAO {

	@Resource
	protected SqlSessionTemplate sqlSessionTemplate;

	/**
	 * 
	 * 设置实现
	 * 
	 * @param sqlSessionTemplate
	 */
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public void delete(String statementId, Object deleteObject) {
		try {
			this.sqlSessionTemplate.delete(statementId, deleteObject);
		} catch (Exception e) {
			throw new DAOException("根据参数对象删除数据失败,参数列表(statementId:"
					+ statementId + " deleteObject:" + deleteObject + ")", e);
		}
	}

	@Override
	public void insert(String statementId, Object insertObject) {
		try {
			this.sqlSessionTemplate.insert(statementId, insertObject);
		} catch (Exception e) {
			throw new DAOException("根据参数对象新增数据失败,参数列表(statementId:"
					+ statementId + " insertObject:" + insertObject + ")", e);
		}
	}

	@Override
	public <T extends BaseVO> void insert(String statementId, T entity) {
		try {
			// refreshUpdateTime(entity);
			this.sqlSessionTemplate.insert(statementId, entity);
		} catch (Exception e) {
			throw new DAOException("根据参数对象新增数据失败,参数列表(statementId:"
					+ statementId + " entities:" + entity + ")", e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends BaseVO> void insertBatch(final String statementId,
			final Collection<T> entities) {
		try {
			this.sqlSessionTemplate.execute(new SqlSessionCallback() {
				public Collection<T> doInSqlSession(SqlSession sqlSession)
						throws SQLException {
					for (BaseVO t : entities) {
						sqlSession.insert(statementId, t);
					}
					return entities;
				}
			});
		} catch (Exception e) {
			throw new DAOException("根据参数对象批量数据失败,参数列表(statementId:"
					+ statementId + " entities:" + entities + ")", e);
		}
	}

	@Override
	public void update(String statementId, Object updateObject) {
		try {
			this.sqlSessionTemplate.update(statementId, updateObject);
		} catch (Exception e) {
			throw new DAOException("根据参数对象更新数据失败,参数列表(statementId:"
					+ statementId + " updateObject:" + updateObject + ")", e);
		}
	}

	@Override
	public <T extends BaseVO> void update(String statementId, T entity) {
		try {
			// refreshUpdateTime(entity);
			this.sqlSessionTemplate.update(statementId, entity);
		} catch (Exception e) {
			throw new DAOException("根据参数对象更新数据失败,参数列表(statementId:"
					+ statementId + " entity:" + entity + ")", e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends BaseVO> void updateBatch(final String statementId,
			final Collection<T> entities) {
		try {
			this.sqlSessionTemplate.execute(new SqlSessionCallback() {
				public Collection<T> doInSqlSession(SqlSession sqlSession)
						throws SQLException {
					for (BaseVO t : entities) {
						sqlSession.update(statementId, t);
					}
					return entities;
				}
			});
		} catch (Exception e) {
			throw new DAOException("根据参数对象批量数据失败,参数列表(statementId:"
					+ statementId + " entities:" + entities + ")", e);
		}
	}

	@Override
	public Object getObject(String statementId, Object selectParamObject) {
		try {
			return this.sqlSessionTemplate.selectOne(statementId,
					selectParamObject);
		} catch (Exception e) {
			throw new DAOException("根据参数对象读取数据失败,参数列表(statementId:"
					+ statementId + " selectParamObject:" + selectParamObject
					+ ")", e);
		}
	}

	@Override
	public <T extends BaseVO> List<T> queryList(String statementId,
			Object queryParamObject) {
		try {
			return this.sqlSessionTemplate.selectList(statementId,
					queryParamObject);
		} catch (Exception e) {
			throw new DAOException("查询全部数据失败,参数列表(statementId:" + statementId
					+ " queryParamObject:" + queryParamObject + ")", e);
		}
	}

	@Override
	public <T extends Serializable> List<T> queryList(String statementId,
			Object queryParamObject, int pageNo, int pageSize) {
		try {
			int iOffset = (pageNo - 1) * pageSize;
			RowBounds objRowBounds = new RowBounds(iOffset, pageSize);
			return this.sqlSessionTemplate.selectList(statementId,
					queryParamObject, objRowBounds);
		} catch (Exception e) {
			throw new DAOException("分页查询全部数据失败,参数列表(statementId:" + statementId
					+ " queryParamObject:" + queryParamObject + " pageNo:"
					+ pageNo + " pageSize:" + pageSize + ")", e);
		}
	}

}

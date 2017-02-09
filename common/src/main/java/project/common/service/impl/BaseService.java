
package project.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import project.common.mapper.MyMapper;
import project.common.model.DataResult;
import project.common.service.IService;

public abstract class BaseService<T> implements IService<T> {

	@Override
	public DataResult<String> ping() {
		String str = "测试成功";
		return new DataResult<String>("running.恭喜-服务正在运行中-" + str);
	}

	@Autowired
	protected MyMapper<T> mapper;

	public int insertUseGeneratedKeys(T entity) {
		return mapper.insertUseGeneratedKeys(entity);
	}

	public T selectByPrimaryKey(Object key) {
		return mapper.selectByPrimaryKey(key);
	}

	public int insert(T entity) {
		return mapper.insert(entity);
	}

	public int insertSelective(T entity) {
		return mapper.insertSelective(entity);
	}

	public int deleteByPrimaryKey(Object key) {
		return mapper.deleteByPrimaryKey(key);
	}

	public int updateByPrimaryKey(T entity) {
		return mapper.updateByPrimaryKey(entity);
	}

	public int updateByPrimaryKeySelective(T entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	public List<T> selectByExample(Object example) {
		return mapper.selectByExample(example);
	}

}

package dao;

import java.util.List;

import bean.Demo;

public interface IDemoDao {

	/**
	 * 返回列表(条件查询)
	 * @return
	 */
	public List<Demo> getList(Demo demo);
	
}

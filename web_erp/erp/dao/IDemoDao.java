package dao;

import java.util.List;

import bean.Demo;

public interface IDemoDao {

	/**
	 * �����б�(������ѯ)
	 * @return
	 */
	public List<Demo> getList(Demo demo);
	
}

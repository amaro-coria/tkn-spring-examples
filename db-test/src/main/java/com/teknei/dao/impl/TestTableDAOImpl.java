package com.teknei.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teknei.dao.TestTableDAO;
import com.teknei.entities.TestTable;

//@Component  @Service   @Repository
@Repository
@Transactional
public class TestTableDAOImpl implements TestTableDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	public List<TestTable> findAll() {
		List<TestTable> resultList =  null;
		//Forma # 1 por Query
		//Query query =  sessionFactory.getCurrentSession().createQuery("FROM TestTable"); //select * from test.test.test_table;
		//resultList = query.list();
		//Forma #2 por Criteria
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(TestTable.class);
		resultList = criteria.list();
		return resultList;
	}

}

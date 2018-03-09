package com.teknei.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.teknei.dao.TestTableDAO;
import com.teknei.entities.TestTable;
import com.teknei.facade.TestFacade;

//@Component @Service @Repository
@Component
public class TestFacadeImpl implements TestFacade {

	@Autowired
	private TestTableDAO dao;

	public List<String> getValues() {
		List<TestTable> listEntities = dao.findAll();
		List<String> listResult = new ArrayList<String>();
		for (TestTable testTable : listEntities) {
			listResult.add(testTable.getValue());
		}
		return listResult;
	}

}

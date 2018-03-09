package com.teknei.dao;

import java.util.List;

import com.teknei.entities.TestTable;

public interface TestTableDAO {

	List<TestTable> findAll();
	
	
}
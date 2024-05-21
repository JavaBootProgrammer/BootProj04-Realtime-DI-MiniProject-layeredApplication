package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDAO {
	public List<Employee> getEmployeesByDesgs(String designation1, String designation2, String designation3) throws Exception;
}

package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface Service {
		public String addEmployee(Employee e);
		public String insuranceScheme(double salary,String designation);
		public List<Employee> AllEmployee();
	

}

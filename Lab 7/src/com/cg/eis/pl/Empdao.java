package com.cg.eis.pl;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface Empdao {


	public String addEmployee(Employee e);
	public String insuranceScheme(double salary, String designation);
	public List<Employee> AllEmployee();
	

}

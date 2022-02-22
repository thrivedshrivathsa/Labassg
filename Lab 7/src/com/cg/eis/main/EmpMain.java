package com.cg.eis.main;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;
import com.cg.eis.service.ServiceImp;

public class EmpMain {

	public static void main(String[] args) {
		Service es=new ServiceImp();
		Employee e=null;
			
		Scanner sc=new Scanner(System.in);
		double salary;
		String id,name,desig;
		
		while(true) {
			System.out.println("1. Add Employee \n2. Get Scheme \n3. Show All Employee \n4. Exit");
			
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter id");
			       id=sc.next();
			       System.out.println("Enter Name");
			       name=sc.next();
			       System.out.println("Enter Salary");
			       salary=sc.nextDouble();
		           System.out.println("Enter Designation [System Associate, Programmer, Manager]");
			       desig=sc.next();
			       e=new Employee(id,name,salary,desig);
			       System.out.println(es.addEmployee(e));
			       break;
			case 2: System.out.println("Enter Salary");
		            salary=sc.nextDouble();
	             	System.out.println("Enter Designation");
		            desig=sc.next();
				    System.out.println(es.insuranceScheme(salary,desig));
				    break;
			case 3:  System.out.print(es.AllEmployee()+"\n");
			         break;
			case 4: System.out.print("Exit");;
			default: System.out.println("Wrong choice");
			}
			
		}
		
	}


	}


package com.assignment;



import java.util.ArrayList;
import java.util.List;

public class TestEmployeeManagement {

	public static void main(String[] args) {
		EmployeeManagement em1= new EmployeeManagement(1,"Anu",30000);
		EmployeeManagement em2= new EmployeeManagement(2,"nusha",45000);
		EmployeeManagement em3= new EmployeeManagement(3,"Anshu",50000);
		 List<EmployeeManagement> employeeList = new ArrayList<>();
	        employeeList.add(em1);
	        employeeList.add(em2);
	        employeeList.add(em3);

	     
	        for (EmployeeManagement emp : employeeList) {
	            emp.displayDetails();
	        }
	}

}


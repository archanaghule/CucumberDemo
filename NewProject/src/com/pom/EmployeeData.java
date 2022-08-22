package com.pom;

import java.util.ArrayList;

public class EmployeeData {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"lalita",23);
		Employee e2 = new Employee(2,"pooja",24);
		
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(e1);
		arrayList.add(e2);
		
		for(Employee emp :arrayList)
		{
			System.out.println(emp.empId+ " "+emp.eName+" "+emp.eAge);
		}
		
	}

}

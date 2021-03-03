package com.parth.EmployeeAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainApp {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		EmployeeService service = new EmployeeService();
		int option,id,salary;
		String d;
		boolean flag = true;
		do
		{
			System.out.println("1. Create Employee\n2. Update salary for all employees\n3. Update employee details\n4. Delete an employee record\n5. View all employees\n6. View employee by id\n7. Exit\n");
			option = sc.nextInt();
			switch(option)
			{
				case 1: Employee e = new Employee();
						sc.nextLine();
						System.out.println("Enter first name: ");
						e.setFname(sc.nextLine());
						System.out.println("Enter last name: ");
						e.setLname(sc.nextLine());
						System.out.println("Enter age: ");
						int age = sc.nextInt();
						sc.nextLine();
						while(age <0 || age > 99)
						{
							System.out.println("Invalid Age!! Enter an age between 0 and 99");
							age = sc.nextInt();
							sc.nextLine();
						}
						e.setAge(age);
						System.out.println("Enter salary: ");
						e.setSalary(sc.nextInt());
						sc.nextLine();
						System.out.println("Enter DOB in dd/mm/yyyy format");
						d = sc.nextLine();
						Date date = null;
						try {
							date = new SimpleDateFormat("dd/MM/yyyy").parse(d);
						} catch (ParseException e1) {
							e1.printStackTrace();
						}
						while(date == null)
						{
							System.out.println("Invalid Date!!! Make sure the format is correct");
							d = sc.nextLine();
							try {
								date=new SimpleDateFormat("dd/MM/yyyy").parse(d);
							} catch (ParseException e1) {
								e1.printStackTrace();
							}
						}
						e.setDob(date);
						System.out.println("Enter designation: ");
						e.setDesignation(sc.nextLine());
						service.makeEmp(e);
						break;
				case 2: System.out.println("Enter new salary: ");
						salary = sc.nextInt();
						service.updateEmpAll(salary);
						break;
				case 3: System.out.println("Enter employee ID: ");
						id = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter salary: ");
						salary = sc.nextInt();
						sc.nextLine();
						service.updateEmpId(id, salary);
						break;
				case 4: System.out.println("Enter employee ID: ");
						id = sc.nextInt();
						sc.nextLine();
						service.deleteEmp(id);
						break;
				case 5: System.out.println("Employee List: ");
						ArrayList<Employee> list = (ArrayList<Employee>) service.getEmpAll();
						for(Employee e1 : list)
						{
							System.out.println(e1);
						}
						break;
				case 6: System.out.println("Employee ID: ");
						id = sc.nextInt();
						sc.nextLine();
						e = service.getEmpID(id);
						if(e==null)
						{
							System.out.println("Employee not found!");
						}
						else
						{
							System.out.println(e);
						}
						break;
				case 7: flag=false;
						break;
				default: System.out.println("Please choose a number between 1 to 7.");
						break;
			}
		}
		while(flag);
		sc.close();
		
	}

}

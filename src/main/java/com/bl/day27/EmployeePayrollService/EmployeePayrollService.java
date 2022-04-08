package com.bl.day27.EmployeePayrollService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	
	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}


	private List<EmployeePayrollData> emplyeePayrollList;
	
	public EmployeePayrollService() {
		
	}
	
	public EmployeePayrollService(List<EmployeePayrollData> emplyeePayrollList) {
		this.emplyeePayrollList = emplyeePayrollList;
	}
	
	private void showData() {
		System.out.println("Employee data is : " +emplyeePayrollList);
	}
	
	private void writeData(Scanner data) throws IOException {
		
		System.out.println("Enter Employee name : ");
	    String name = data.nextLine();
	    System.out.println("Enter Employee ID : ");
	    int id = data.nextInt();
	    System.out.println("Enter Employee salary : ");
	    double salary = data.nextDouble();
	   
		EmployeePayrollData empData = new EmployeePayrollData(id, name, salary);
		emplyeePayrollList.add(empData);
	}
	

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		ArrayList<EmployeePayrollData> emplyeePayrollList = new ArrayList<EmployeePayrollData>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(emplyeePayrollList);
		employeePayrollService.writeData(input);
		employeePayrollService.showData();
		
		

	}
}

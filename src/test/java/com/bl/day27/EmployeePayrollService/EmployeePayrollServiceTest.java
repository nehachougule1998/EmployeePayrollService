package com.bl.day27.EmployeePayrollService;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

//import com.bl.day27.EmployeePayrollServiceTest.IOService;
public class EmployeePayrollServiceTest {

	@Test
	public void given3Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries() throws IOException
	{
		EmployeePayrollData[] arrayOfEmployees = {
				new EmployeePayrollData(1, "Jeff Bezos", 100000.0),
				new EmployeePayrollData(2, "Bill Gates", 200000.0),
				new EmployeePayrollData(3, "Mark Zuckerberg", 300000.0)
		};
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
		employeePayrollService.writeEmployeeData(com.bl.day27.EmployeePayrollService.EmployeePayrollService.IOService.FILE_IO);

	}
}
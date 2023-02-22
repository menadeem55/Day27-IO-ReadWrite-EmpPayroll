package com.bridgelabz.jdbc1.Day27_Emp_File_IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class EmployeePayrollService {
	public long listFilesDirectory() throws IOException, InterruptedException {

		long enteries = 0;
		enteries = Files.lines(new File(
				"D:\\BridgelabzClassWork\\Assignment-243\\Day27-Emp-File-IO\\src\\main\\java\\com\\bridgelabz\\jdbc1\\Day27_Emp_File_IO\\testdemo.txt")
				.toPath()).count();
		System.out.println(enteries);
		return enteries;
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		EmployeePayrollService emp = new EmployeePayrollService();
		emp.listFilesDirectory();

	}
}

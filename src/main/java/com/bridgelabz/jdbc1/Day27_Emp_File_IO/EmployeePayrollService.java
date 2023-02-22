package com.bridgelabz.jdbc1.Day27_Emp_File_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class EmployeePayrollService {
	public void listFilesDirectory() throws IOException, InterruptedException {
		ArrayList<String> writing = new ArrayList<String>();

		writing.add("Id : 1001");
		writing.add("Name : Nadeem Akhtar");
		writing.add("Salary : 84761");
		writing.add("Date : 23-02-2023");
		// File Exist => Override
		// Will create new file if not exist
		Files.write(Paths.get("D:\\BridgelabzClassWork\\Assignment-243\\Day27-Emp-File-IO\\src\\main\\java\\com\\bridgelabz\\jdbc1\\Day27_Emp_File_IO\\testdemo.txt"),
				writing, StandardOpenOption.CREATE);
		System.out.println("Exporting Into File");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		EmployeePayrollService obj = new EmployeePayrollService();
		obj.listFilesDirectory();
	}
}

package com.bridgelabz.jdbc1.Day27_Emp_File_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EmployeePayrollService {
	public void listFilesDirectory() throws IOException, InterruptedException {

		List<String> line = Files.readAllLines(Paths.get(
				"D:\\BridgelabzClassWork\\Assignment-243\\Day27-Emp-File-IO\\src\\main\\java\\com\\bridgelabz\\jdbc1\\Day27_Emp_File_IO\\testdemo.txt"));
		for (String lines : line) {
			System.out.println(lines);
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		EmployeePayrollService obj = new EmployeePayrollService();
		obj.listFilesDirectory();
	}
}

package com.bridgelabz.jdbc1.Day27_Emp_File_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EmployeePayrollService {
	public void empPayrollRead() throws IOException {
		Path playPath = Paths.get("D:\\BridgelabzClassWork\\Assignment-243\\Day27-Emp-File-IO\\src\\main\\java\\com\\bridgelabz\\jdbc1\\Day27_Emp_File_IO\\");

		Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::print);
		Files.newDirectoryStream(playPath).forEach(System.out::println);
		Files.newDirectoryStream(playPath, path -> path.toFile().isFile() && path.toString().startsWith("temp"));

	}

	public static void main(String[] args) throws IOException {
		EmployeePayrollService emp = new EmployeePayrollService();

		emp.empPayrollRead();
	}
}

package com.bridgelabz.jdbc1.Day27_Emp_File_IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	public void empPayrollRead() throws IOException {
		List<String> lines = Files.readAllLines(Paths.get("D:\\BridgelabzClassWork\\Assignment-243\\Day27-Emp-File-IO\\src\\main\\java\\com\\bridgelabz\\jdbc1\\Day27_Emp_File_IO\\readWrite.txt"));

		for (String line : lines) {

		}

	}

	public void writeDataEmployeePayRoll() throws IOException {
		ArrayList<String> data = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		data.add(sc.next());
		System.out.println("Enter Name");
		data.add(sc.next());
		System.out.println("Enter Salary");
		data.add(sc.next());
		Files.write(Paths.get("D:\\BridgelabzClassWork\\Assignment-243\\Day27-Emp-File-IO\\src\\main\\java\\com\\bridgelabz\\jdbc1\\Day27_Emp_File_IO\\readWrite.txt"),
				data, StandardOpenOption.CREATE);

	}

	public static void main(String[] args) throws IOException {
		EmployeePayrollService emp = new EmployeePayrollService();
		emp.writeDataEmployeePayRoll();
		emp.empPayrollRead();
	}
}

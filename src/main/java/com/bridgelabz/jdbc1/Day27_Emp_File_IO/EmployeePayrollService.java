package com.bridgelabz.jdbc1.Day27_Emp_File_IO;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import static java.nio.file.StandardWatchEventKinds.*;

public class EmployeePayrollService {
	public void listFilesDirectory() throws IOException, InterruptedException {
		// Activate watch Service
		WatchService watchService = FileSystems.getDefault().newWatchService();

		// Convert location to file path
		Path path = Paths.get("D:\\BridgelabzClassWork\\Assignment-243\\Day27-Emp-File-IO\\src\\main\\java\\com\\bridgelabz\\jdbc1\\Day27_Emp_File_IO");

		// Register watch service on above path ==> Pass events to be watched
		// (Create/Delete/Modify)
		path.register(watchService, ENTRY_CREATE, ENTRY_DELETE);

		List<String> logs = new ArrayList<String>();

		boolean poll = true;
		while (poll) {

			// Reference / Pointer current file or folder watching
			WatchKey key = watchService.take();

			// Printing the events (Create / Modify / Delete)
			for (WatchEvent<?> event : key.pollEvents()) {
				System.out.println("Event kind : " + event.kind() + " - File : " + event.context());

				logs.add("Event kind : " + event.kind() + " - File : " + event.context());
			}

			Files.write(Paths.get("D:\\BridgelabzClassWork\\Assignment-243\\Day27-Emp-File-IO\\src\\main\\java\\com\\bridgelabz\\jdbc1\\Day27_Emp_File_IO"),
					logs, StandardOpenOption.CREATE);

			// Reseting the reference so that it can be used later
			poll = key.reset();
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		EmployeePayrollService obj = new EmployeePayrollService();
		obj.listFilesDirectory();
	}
}

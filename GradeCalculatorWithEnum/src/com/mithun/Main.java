package com.mithun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mithun.model.Student;
import com.mithun.myenum.Grade;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please Enter Student Info\n");
		String name, department = null;
		String id;
		int hci;
		int dbms;
		int ai;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Department:");
		try {
			department = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		while (true) {
			try {
				System.out.println("Name:");
				name = br.readLine();
				System.out.println("id:");
				id = br.readLine();

				System.out.println("enter marks of three subjects seperated by space\n:");
				String[] marks = br.readLine().split(" ");

				hci = Integer.parseInt(marks[0]);
				dbms = Integer.parseInt(marks[1]);
				ai = Integer.parseInt(marks[2]);

				Student s1 = new Student(name, id, department, hci, dbms, ai);

				System.out.printf("Name: %s Avg GP: %.2f\n",s1.getStudentName(), s1.getAvgGP());
				
				System.out.println("Do you want to run it again ? \n Press N to exit.");
				if(br.readLine().equalsIgnoreCase("N"))
					break;
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
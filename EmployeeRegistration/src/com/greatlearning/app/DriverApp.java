package com.greatlearning.app;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServiceImpl;

public class DriverApp {
	public static void main(String[] args, Object e1) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your First Name");
		String fName = sc.next();
		System.out.println("Enter your Last Name");
		String lName = sc.next();

		Employee emp = new Employee(fName, lName, null, null);
		emp.setFirstName(fName);
		emp.setLastName(lName); 
		
		EmployeeServiceImpl esi = new EmployeeServiceImpl();
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.HR");
		System.out.println("4.Legal");
		System.out.println("5.Enter your choice");
		int choice = sc.nextInt();
		String gEmail = "";
				String genPassword = "";		
				switch(choice)
				{
				case 1: gEmail= esi.generateUserEmail(emp.getFirstName(), emp.getLastName(), "tech");
						break;	 
				case 2:gEmail= esi.generateUserEmail(emp.getFirstName(), emp.getLastName(), "admin");
						break;
				case 3:gEmail= esi.generateUserEmail(emp.getFirstName(), emp.getLastName(), "hr");
						break;
				case 4:gEmail= esi.generateUserEmail(emp.getFirstName(), emp.getLastName(), "legal");
						break;	
				default: System.out.println("Please enter a valid input");	
				}
	genPassword=esi.generateUserPassword();

	emp.setUseremail(gEmail);
	emp.setPassword(genPassword);


	String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)" + "(?=.*[-+_!@#$%^&*., ?]).+$";

	Pattern p = Pattern.compile(regex);
	Matcher m = p.matcher(
			genPassword);if(m.matches())System.out.println("Valid Password");else System.out.println("inValid Password");
}

}

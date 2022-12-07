package com.application.main;
import java.util.Scanner;
import com.application.services.CredentialServiceImplement;
import com.application.services.CredentialServices;
import com.application.model.Employee;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CredentialServices Serv = new CredentialServiceImplement();
Scanner sc = new Scanner(System.in);
System.out.println("Please enter your first name");
String firstName = sc.next();
System.out.println("Please enter your last name");
String lastName = sc.next();
Employee employee = new Employee(firstName, lastName);
String department = null;
System.out.println("Please enter your choice");
int choice = sc.nextInt();
switch (choice) {
case 1:
	department = "technical";
	break;
case 2:
	department = "admin";
	break;
case 3:
	department = "hr";
	break;
case 4:
	department = "legal";
	break;
default:
	System.out.println("Please enter the correct value");
	return;
}
Serv.generateEmailAddress(employee, department);
Serv.displayCredentials(employee, department);






	}

}

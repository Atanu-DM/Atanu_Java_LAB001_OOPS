package com.application.services;

import com.application.model.Employee;
import java.util.Random;
public class CredentialServiceImplement implements CredentialServices{

	@Override
	public String generatePassword() {
		String CapCharacter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String SmallCharacter = "abcdefghijklmnopqrstuvwxyz";
		int Number = 123456789;
		String Special = "!@#$%^&*";
		String Values = CapCharacter+SmallCharacter+Number+Special;
		Random rndm = new Random();
		char[] password = new char[8];
		for(int i = 0;i < 8;i++) {
			int RandomNumber = rndm.nextInt(Values.length());
			password [i] = Values.charAt(RandomNumber);
			
		}
		
		return new String(password);
	}

	@Override
	public String generateEmailAddress(Employee employee, String department) {
		// TODO Auto-generated method stub
		return (employee.getFirstName()+employee .getLastName()).toLowerCase()+"@"+department+".abc.com";
		
	}

	@Override
	public void displayCredentials(Employee employee, String department) {
		// TODO Auto-generated method stub
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows: ");
		System.out.println("Email- "+generateEmailAddress(employee, department));
		System.out.println("Password- " + generatePassword());
		
	}

}

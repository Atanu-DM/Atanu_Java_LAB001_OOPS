package com.application.services;
import com.application.model.Employee;
public interface CredentialServices {
public String generatePassword();
public String generateEmailAddress(Employee employee, String department);
public void displayCredentials(Employee employee, String department);



}

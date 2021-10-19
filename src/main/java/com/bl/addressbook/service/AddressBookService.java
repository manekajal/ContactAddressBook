package com.bl.addressbook.service;

import com.bl.addressbook.models.Contact;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBookService {
    private static List<Contact> contact;

    private static List<Contact> addressBookServiceList;

    public enum IOService{console_IO,FILE_IO,DB_IO,REST_IO};

    public AddressBookService() {

    }

    public AddressBookService(List<Contact> addressBookServiceList){
        this.addressBookServiceList =addressBookServiceList;

    }





    public void readEmployeePayrollData(Scanner consoleInputReader) {


        System.out.println(" Enter Employee First Name :");
        String firstName= consoleInputReader.next();
        System.out.println(" Enter Employee Last Name :");
        String lastName= consoleInputReader.next();
        System.out.println(" Enter Employee Address :");
        String address= consoleInputReader.next();
        System.out.println(" Enter Employee City :");
        String city= consoleInputReader.next();
        System.out.println(" Enter Employee State :");
        String state= consoleInputReader.next();
        System.out.println(" Enter Employee Zip Code :");
        String zipCode= consoleInputReader.next();
        System.out.println(" Enter Employee Mobile Number :");
        String mobileNo= consoleInputReader.next();
        System.out.println(" Enter Employee Email ID :");
        String emailId= consoleInputReader.next();

        addressBookServiceList.add(new Contact(firstName,lastName,address,city,state,zipCode,mobileNo,emailId));

    }
    public void writeEmployeePayrollData() {

        System.out.println(" Writing Employee Payroll Roaster to console \n" +addressBookServiceList);

    }

}